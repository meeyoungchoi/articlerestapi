package com.example.articlerestapi.repository;

import com.example.articlerestapi.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository //db와 소통하는 인터페이스 jpa가 해당 객체를 알아서 만든다
        extends CrudRepository<Article, Long> {//관리대상은 Article, 대상의 pk는 Long타입
}
