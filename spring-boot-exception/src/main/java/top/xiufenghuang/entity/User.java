package top.xiufenghuang.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import top.xiufenghuang.annotation.Phone;
import top.xiufenghuang.annotation.UserID;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/4/8 14:42
 */@Data
public class User {
     @NotBlank(message = "用户名不能为空")
     private String username;
     @NotBlank(message = "密码不能为空")
     private String password;
     @Max(value = 100,message = "年龄不能超过100岁")
     @Max(value = 100,message = "年龄不能超过100岁")
     private int age;
     @Phone
     private String phone;
     @UserID
     private String userid;


}