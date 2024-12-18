package com.fastcampus.projectBoard1.dto.request;

import com.fastcampus.projectBoard1.dto.ArticleCommentDto;
import com.fastcampus.projectBoard1.dto.UserAccountDto;

/**
 * DTO for {@link com.fastcampus.projectBoard1.domain.ArticleComment}
 */
public record ArticleCommentRequest(long articleId, String content) {
  public static ArticleCommentRequest of(long articleId, String content) {
    return new ArticleCommentRequest(articleId, content);
  }

  public ArticleCommentDto toDto(UserAccountDto userAccountDto) {
    return ArticleCommentDto.of(
            articleId,
            userAccountDto,
            content
    );
  }
}