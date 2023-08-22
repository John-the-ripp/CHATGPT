package com.example.demo.controller;

import com.example.demo.model.Article;
import com.example.demo.service.ArticleService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/article")
public class ArticleController {

    private final ArticleService articleService;


    public ArticleController(ArticleService articleService){
        this.articleService = articleService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Article>> getAllArticles(){
        List<Article> articles = articleService.findAllArticle();
        return new ResponseEntity<>(articles, HttpStatus.OK);

    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Article> getArticleById(@PathVariable("id") int id){
        Article articles = articleService.findArticleById(id);
        return new ResponseEntity<>(articles, HttpStatus.OK);

    }
    @PostMapping("/add")
    public ResponseEntity<Article> addArticle(@RequestBody Article article){
        Article newArticle = articleService.addArticle(article);
        return  new ResponseEntity<>(newArticle,HttpStatus.CREATED);

    }
    @PutMapping("/delete/{id}")

    public ResponseEntity<?> updateArticle(@PathVariable("id") int id){
        articleService.deleteArticle(id);
        return new ResponseEntity<>(HttpStatus.OK);


    }

}
