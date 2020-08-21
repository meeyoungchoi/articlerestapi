package com.example.articlerestapi.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Getter
@ToString
@NoArgsConstructor
@Entity
public class Article {
    @Id//db에서 pk(primark key)라고 함
    @GeneratedValue(strategy = GenerationType.IDENTITY)//db에서 자동관리  생성시 마다 자동 증가
    private Long id;

    @Column(length = 100, nullable = false)//최대 100글자 비어있으면 안됨
    private String title;
    
    @Column(columnDefinition =  "TEXT", nullable = false) //텍스트 타입, 비어있으면 안됨
    private String content;

    @Builder//Builder 패턴 적용
    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }



}
