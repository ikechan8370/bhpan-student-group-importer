package co.d201.bhpanconnect.utils;

import co.d201.bhpanconnect.support.DefaultReader;
import com.alibaba.excel.EasyExcel;
import lombok.experimental.UtilityClass;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.util.concurrent.BlockingQueue;

@UtilityClass
public class ExcelUtils {

    /**
     * 异步读取！
     * @param filename 文件名
     * @param headRowNumber head在第几行，从1开始数
     * @param modelClass 用的bean class
     * @param queue 一个阻塞队列，用于对读取结果进行下一步处理。好处是这边边读另一边边处理，应对大excel时有奇效
     * @param <T> 用的bean class泛型
     */
    public <T> void readExcel(String filename, int headRowNumber, Class<T> modelClass, BlockingQueue<T> queue) {
//        InputStream inputStream = new ClassPathResource(filename).getInputStream();
        DefaultReader<T> listener = new DefaultReader<>();
        listener.setObjs(queue);
        EasyExcel.read(new File(filename), modelClass, listener).headRowNumber(headRowNumber).doReadAll();
    }

}
