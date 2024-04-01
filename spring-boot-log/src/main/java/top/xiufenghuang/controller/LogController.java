package top.xiufenghuang.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/4/1 15:56
 */
@Slf4j
@RestController
public class LogController {
     @GetMapping("/log")
    public void testlog(){
         log.debug("debug 日志");

    }

}