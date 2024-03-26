package top.xiufenghuang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/3/18 14:09
 */
@SpringBootApplication
@MapperScan(basePackages = {"top.xiufenghuang.mapper"})
public class DataBaseApplication {
    public static  void main(String args[]){
        SpringApplication.run(DataBaseApplication.class,args);
    }
}