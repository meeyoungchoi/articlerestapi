package com.example.articlerestapi.controller;

import com.example.articlerestapi.dto.ArticleForm;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ArticleController {

    @GetMapping("/articles")
    public String index() {
        return "articles/index";
    }

    @GetMapping("/articles/new")
    public String newArticle() {
        return "articles/new";
    }

    @PostMapping("/articles")
    public String create(ArticleForm articleForm) {
        log.info(articleForm.toString());
        return "redirect/articles";
    }

}
