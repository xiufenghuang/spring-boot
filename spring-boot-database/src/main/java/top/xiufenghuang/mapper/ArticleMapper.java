package top.xiufenghuang.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.xiufenghuang.entity.Article;

@Mapper
public interface ArticleMapper {
    void insertArticle(Article article);
}
