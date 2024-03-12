package top.xiufenghuang;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/3/11 16:24
 */
@SpringBootApplication
@RestController
@Slf4j
public class TemplateApplication {

    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(TemplateApplication.class);
        Environment env= app.run(args).getEnvironment();
        log.info("启动成功");
        log.info("测试地址： http://localhost:{}", env.getProperty("server.port"));

    }

}

