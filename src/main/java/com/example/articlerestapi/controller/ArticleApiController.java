package com.example.articlerestapi.controller;

import com.example.articlerestapi.dto.ArticleForm;
import com.example.articlerestapi.entity.Article;
import com.example.articlerestapi.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ArticleApiController {
    @Autowired//리파지토리가 객체를 알아서 가져옴
    private ArticleRepository articleRepository;

    @PostMapping("/api/articles")
    public Long create(@RequestBody ArticleForm articleForm) {
        log.info(articleForm.toString());

        Article article = articleForm.toEntity();
        log.info(article.toString());

         Article saved = articleRepository.save(article);
         log.info(saved.toString());

        return saved.getId();
    }

}
