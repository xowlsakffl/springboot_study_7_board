package com.fastcampus.projectBoard1.repository;

import com.fastcampus.projectBoard1.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}