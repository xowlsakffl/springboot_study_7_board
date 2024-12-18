package com.fastcampus.projectBoard1.controller;

import com.fastcampus.projectBoard1.dto.UserAccountDto;
import com.fastcampus.projectBoard1.dto.request.ArticleCommentRequest;
import com.fastcampus.projectBoard1.dto.request.ArticleRequest;
import com.fastcampus.projectBoard1.service.ArticleCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/comments")
@Controller
public class ArticleCommentController {
    private final ArticleCommentService articleCommentService;

    @PostMapping("/new")
    public String postNewArticleComment(ArticleCommentRequest articleCommentRequest) {
        // TODO: 인증 정보를 넣어줘야 한다.
        articleCommentService.saveArticleComment(articleCommentRequest.toDto(UserAccountDto.of("ams", "1234", "ams@kakao.com", "AN", null)));
        return "redirect:/articles/"+articleCommentRequest.articleId();
    }

    @PostMapping("/{commentId}/delete")
    public String deleteArticleComment(@PathVariable Long commentId, Long articleId) {
        // TODO: 인증 정보를 넣어줘야 한다.
        articleCommentService.deleteArticleComment(commentId);
        return "redirect:/articles/"+articleId;
    }
}
