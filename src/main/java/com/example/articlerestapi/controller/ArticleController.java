package com.example.articlerestapi.controller;


import com.example.articlerestapi.entity.Article;
import com.example.articlerestapi.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor//final 필드 값을 알아서 가져온다 @Autowired를 대체한다
@Controller
public class ArticleController {

    private final ArticleRepository articleRepository;

    @GetMapping("/articles")
    public String index(Model model) {
        Iterable<Article> articles = articleRepository.findAll();
        model.addAttribute("articles",articles);
        return "articles/index";
    }

    @GetMapping("/articles/new")
    public String newArticle() {
        return "articles/new";
    }

    @GetMapping("/articles/{id}")
    public String show(@PathVariable Long id, Model model) {
        Article article = articleRepository.findById(id).orElse(null);
        model.addAttribute("article", article);
        return "articles/show";
    }

}
