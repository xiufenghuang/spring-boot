package top.xiufenghuang.service;

import top.xiufenghuang.service.impl.ArticleJpaServiceimpl;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.xiufenghuang.entity.Article;

@SpringBootTest
class ArticleJpaServiceTest {
    @Resource
    ArticleJpaServiceimpl articleJpaService;

    @Test
    void saveArticle() {
        Article article = Article.builder()
                .author("李四")
                .content("Spring Boot")
                .title("Spring BOOt")
                .build();
        articleJpaService.saveArticle(article);
    }


    @Test
    void updateArticle() {
        Article article = Article.builder()
                .author("李四1")
                .content("Spring Boot")
                .title("Spring BOOt")
                .id(3)
                .build();
        articleJpaService.updateArticle(article);
    }

    @Test
    void getArticleById() {
        articleJpaService.getArticleById(2);
    }

    @Test
    void findAll() {
        articleJpaService.findAll();
    }

    @Test
    void deleteArticle() {
        articleJpaService.deleteArticle(3);
    }
}