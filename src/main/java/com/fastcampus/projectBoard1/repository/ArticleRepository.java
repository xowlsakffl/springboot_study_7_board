package com.fastcampus.projectBoard1.repository;

import com.fastcampus.projectBoard1.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}