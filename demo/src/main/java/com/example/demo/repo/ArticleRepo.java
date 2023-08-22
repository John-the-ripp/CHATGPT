package com.example.demo.repo;

import com.example.demo.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepo extends JpaRepository<Article,Integer> {
    void deleteArticleById(int id);

    Article findArticleById(int id);
}
