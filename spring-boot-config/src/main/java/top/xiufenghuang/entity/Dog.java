package top.xiufenghuang.entity;

import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/3/11 15:08
 */
@Data
@Component
public class Dog {
    @Value("${person.dog.name}")
    private  String name;
    @Value("${person.dog.age}")
    private  Integer age;
}