package com.fastcampus.projectBoard1.service;

import com.fastcampus.projectBoard1.domain.type.SearchType;
import com.fastcampus.projectBoard1.dto.ArticleDto;
import com.fastcampus.projectBoard1.dto.ArticleWithCommentsDto;
import com.fastcampus.projectBoard1.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(SearchType searchType, String searchKeyword, Pageable pageable) {
        return Page.empty();
    }

    public ArticleWithCommentsDto getArticle(Long articleId) {
        return null;
    }

    public void saveArticle(ArticleDto dto) {
    }

    public void updateArticle(ArticleDto dto){
    }

    public void deleteArticle(long articleId) {
    }
}
