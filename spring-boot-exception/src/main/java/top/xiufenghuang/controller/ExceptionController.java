package top.xiufenghuang.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xiufenghuang.Server.MyServer;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/4/8 14:24
 */
@RestController
@RequestMapping("we")
public class ExceptionController {
    @Resource
    public MyServer myService;
    @GetMapping("/user/{id}")
    public  void getUser(@PathVariable("id") Integer id){
        if(id == 1){
            myService.unAuthorizedError();
        }else{
            myService.serverError();
        }
    }

}