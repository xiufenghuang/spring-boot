package top.xiufenghuang.entity;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/3/11 15:08
 */
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "person")
public class Person {
    private  String name;
    private  Integer age;
    private  Boolean happy;
    private Date birthday;
    private Map<String,Object> maps;
    private List<Object> lists;
    private  Dog dog;

}