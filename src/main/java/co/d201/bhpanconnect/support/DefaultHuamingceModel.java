package co.d201.bhpanconnect.support;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class DefaultHuamingceModel {

    @ExcelProperty("序号")
    private String index;
    @ExcelProperty("学号")
    private String studentNo;
    @ExcelProperty("姓名")
    private String name;
    @ExcelProperty("性别")
    private String sex;
    @ExcelProperty("学院")
    private String academy;
    @ExcelProperty("专业")
    private String major;
    @ExcelProperty("班级")
    private String clazz;

}
