package com.example.demo.service;

import com.example.demo.model.Article;
import com.example.demo.repo.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class ArticleService {

    private final ArticleRepo articleRepo;


    @Autowired

    public ArticleService(ArticleRepo articleRepo) {
        this.articleRepo = articleRepo;
    }

    public Article addArticle(Article aricles){
        aricles.setId(Integer.valueOf(UUID.randomUUID().toString()));
        return articleRepo.save(aricles);

    }

    public Article findArticleById(int id){
        return articleRepo.findArticleById(id);
    }

    public List<Article> findAllArticle(){
        return articleRepo.findAll();
    }

    public void deleteArticle(int id){
        articleRepo.deleteArticleById(id);
    }
}
