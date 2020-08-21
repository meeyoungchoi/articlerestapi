package com.example.articlerestapi.dto;


import com.example.articlerestapi.entity.Article;
import lombok.Data;

@Data
public class ArticleForm {

    private String title;
    private String content;

    //빌더 패턴으로 객체를 생성하겠다 
    //생성자의 변형형태
    public Article toEntity() {
        return Article.builder()
                      .id(null)
                      .title(title)
                      .content(content)
                      .build();
    }



}
