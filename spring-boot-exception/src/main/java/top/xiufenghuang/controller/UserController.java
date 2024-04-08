package top.xiufenghuang.controller;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.xiufenghuang.entity.User;
import top.xiufenghuang.result.Result;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/4/8 14:45
 */
@RestController
public class UserController {


   @PostMapping("/user/add")
    public Result<?> addUser(@Valid @RequestBody User user, BindingResult bindingResult){
    if(bindingResult.hasErrors()){}
    return  Result.error(bindingResult.getAllErrors().get(0).getDefaultMessage());
    }
}