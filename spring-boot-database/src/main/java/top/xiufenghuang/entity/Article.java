package top.xiufenghuang.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/3/18 14:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity //*
@Table(name = "t_article") //可选
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,length = 32)
    private String author;

    private String title;

    private String content;
}
