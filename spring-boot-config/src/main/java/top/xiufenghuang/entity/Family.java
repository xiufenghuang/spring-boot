package top.xiufenghuang.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/3/11 14:21
 */
@Data
@Component
@Validated
@ConfigurationProperties(prefix= "family") //整体前缀
//@propertySource(value = {"classpath:family.properties})
public class Family {

//    @Value("${family.family-name}")
  private  String familyName;
//    @Value("${family.father}")
   // @Length()
  private  String father;
//    @Value("${family.mother}")
   private  String mother;
//    @Value("${family.child}")
   private  String child;
   //@Range()
   private  Integer age;

}