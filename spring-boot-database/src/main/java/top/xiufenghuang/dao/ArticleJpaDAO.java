package top.xiufenghuang.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.xiufenghuang.entity.Article;

public interface ArticleJpaDAO extends JpaRepository<Article,Integer> {



}
