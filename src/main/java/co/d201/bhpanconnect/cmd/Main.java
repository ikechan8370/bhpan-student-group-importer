package co.d201.bhpanconnect.cmd;

import co.d201.bhpanconnect.support.DefaultHuamingceModel;
import co.d201.bhpanconnect.utils.AnyshareUtils;
import co.d201.bhpanconnect.utils.ExcelUtils;
import io.openDocAPI.client.ApiException;
import io.openDocAPI.client.api.DefaultApi;
import io.openDocAPI.client.model.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.cli.*;
import org.springframework.util.StringUtils;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

@Slf4j
public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ParseException {
        System.out.println("欢迎使用北航网盘学生花名册导入工具");
        CommandLineParser commandLineParser = new DefaultParser();
        Options options = new Options();
        options.addOption("u", "username", true, "学号，大写");
        options.addOption("p", "password", true, "密码，若通过环境变量BHPAN_PASSWORD指定可不显式指定");
        options.addOption("f", "file", true, "花名册文件地址");
        options.addOption("r", "row", true, "花名册head的行数，默认为6，表示第6行。");
        options.addOption("g", "group", true, "群组id，从网页版北航网盘群组页面url获取，不要带gns://前缀");
        options.addOption("h", "help", false, "获取使用帮助");
        CommandLine commandLine = commandLineParser.parse(options, args);
        String username = commandLine.getOptionValue("username");
        String password = commandLine.getOptionValue("password");
        String filename = commandLine.getOptionValue("file");
        String group = commandLine.getOptionValue("group");

        if (commandLine.hasOption("help")) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("bhpan-student-importer -f <file path> -u <username> -p <password> -r <row> -g <group id>", options);
            System.exit(0);
        }
        if (null == username || filename == null || group == null) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("bhpan-student-importer", options);
            System.exit(0);
        }
        if (password == null) {
            String bhpanPassword = System.getenv("BHPAN_PASSWORD");
            if (StringUtils.hasText(bhpanPassword)) {
                password = bhpanPassword;
            } else {
                System.out.println("没有指定密码！请显式传入密码或指定环境变量BHPAN_PASSWORD，如使用docker，请指定\"-e BHPAN_PASSWORD=<password>\"");
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("bhpan-student-importer -f <file path> -u <username> -p <password> -r <row> -g <group id>", options);
                System.exit(0);
            }
        }
        log.info("username is {}", username);
        log.info("file path: {}", filename);
        String rowNum;
        if (commandLine.hasOption("row")) {
            rowNum = commandLine.getOptionValue("row");
            log.info("head row num: {}", rowNum);
        } else {
            log.info("head row num is set to default value: 6");
            rowNum = "6";
        }
        log.info("准备导入，请等待！");
        try {
            DefaultApi apiInstance = AnyshareUtils.getApiInstance(username, password);
            LinkedBlockingDeque<DefaultHuamingceModel> queue = new LinkedBlockingDeque<>();
            ExcelUtils.readExcel(filename, Integer.parseInt(rowNum.trim()), DefaultHuamingceModel.class, queue);
            List<Perm2SetReqPerminfo> perm2SetReqPerminfos = new ArrayList<>();
            while (true) {
                DefaultHuamingceModel huamingceModel = queue.poll(3, TimeUnit.SECONDS);
                if (huamingceModel == null) {
                    log.info("read finished");
                    break;
                }
                // 1. 根据学号搜索，以获取userid
                DepartmentSearchReq departmentSearchReq = new DepartmentSearchReq();
                departmentSearchReq.setKey(huamingceModel.getStudentNo());
                DepartmentSearchRes departmentSearchRes = apiInstance.departmentSearchPost(departmentSearchReq);
                String userid = departmentSearchRes.getUserinfos().get(0).getUserid();
                // 2. 构建一个群组权限
                Perm2SetReqPerminfo perm2SetReqPerminfo = new Perm2SetReqPerminfo();
                perm2SetReqPerminfo.setAccessortype(Perm2SetReqPerminfo.AccessortypeEnum.USER);
                perm2SetReqPerminfo.setAccessorid(userid);
                // 2.2 设置用户的群组具体权限
                perm2SetReqPerminfo.setAllowvalue(AnyshareUtils.show + AnyshareUtils.preview + AnyshareUtils.download);
//                perm2SetReqPerminfo.setDenyvalue(AnyshareUtils.show + AnyshareUtils.preview + AnyshareUtils.download);
                // 2.3 endtime = -1表示永不过期
                perm2SetReqPerminfo.setEndtime(-1L);
                perm2SetReqPerminfos.add(perm2SetReqPerminfo);
                log.info("构建1个群组权限: {}", departmentSearchRes.getUserinfos().get(0).getName());
            }
            // 3. 设置权限
            Perm2SetReq perm2SetReq = new Perm2SetReq();
            // 3.1 群组的id，从页面url获取后拼接前缀gns://即可
            perm2SetReq.setDocid("gns://" + group);
            perm2SetReq.setInherit(true);
            perm2SetReq.setPerminfos(perm2SetReqPerminfos);
            Perm2SetRes perm2SetRes = apiInstance.perm2SetPost(perm2SetReq);
            if (perm2SetRes.getResult() == 0L) {
                log.info("成功添加{}个权限", perm2SetReqPerminfos.size());
            }
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#auth1GetnewPost");
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
