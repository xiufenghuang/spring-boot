package top.xiufenghuang.entity;


import lombok.Data;

import java.util.Date;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/4/2 9:09
 * 定义访问日志内容记录实体类
 */
@Data
public class AccessLog {
    /**
     * 访问者用户名
     */
    private String username;
    /**
     * 请求路径
     */
    private String uri;
    /**
     * 请求消耗时长
     */
    private Integer duration;
    /**
     * http 方法：GET、POST等
     */
    private String httpMethod;
    /**
     * http 请求响应状态码
     */
    private Integer httpStatus;
    /**
     * 访问者ip
     */
    private String ip;
    /**
     * 此条记录的创建时间
     */
    private Date createTime;

}