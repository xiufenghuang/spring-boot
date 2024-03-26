package top.xiufenghuang.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.xiufenghuang.entity.Article;

@SpringBootTest
class ArticleMapperTest {
    @Autowired
    private ArticleMapper articleMapper;

    @Test
    void insertArticle() {
        Article article = Article.builder()
                .author("11212")
                .title("222")
                .content("2222")
                .build();
        articleMapper.insertArticle(article);
    }
}