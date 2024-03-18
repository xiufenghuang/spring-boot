package top.xiufenghuang.service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.xiufenghuang.dao.ArticleJpaDAO;
import top.xiufenghuang.entity.Article;
import top.xiufenghuang.service.ArticleJpaService;

import java.util.List;
import java.util.Optional;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/3/18 16:19
 * @author hxf13
 */
@Service
public class ArticleJpaServiceimpl implements ArticleJpaService {

    @Resource
    private ArticleJpaDAO articleJpaDAO;

    @Override
    public void saveArticle(Article article) {
        articleJpaDAO.save(article);
    }

    @Override
    public void updateArticle(Article article) {
        articleJpaDAO.save(article);
    }

    @Override
    public Article getArticleById(int id) {
        Optional<Article> articleOptional = articleJpaDAO.findById(id);
        return articleOptional.orElse(null);
    }

    @Override
    public List<Article> findAll() {
        return    articleJpaDAO.findAll();
    }

    @Override
    public void deleteArticle(int id) {
        articleJpaDAO.deleteById(id);
    }
}
