package com.example.articlerestapi.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
