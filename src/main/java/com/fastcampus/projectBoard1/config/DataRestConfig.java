package com.fastcampus.projectBoard1.config;

import com.fastcampus.projectBoard1.domain.Article;
import com.fastcampus.projectBoard1.domain.ArticleComment;
import com.fastcampus.projectBoard1.domain.Hashtag;
import com.fastcampus.projectBoard1.domain.UserAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class DataRestConfig {
    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return RepositoryRestConfigurer.withConfig((config, cors) ->
                config
                        .exposeIdsFor(UserAccount.class)
                        .exposeIdsFor(Article.class)
                        .exposeIdsFor(ArticleComment.class)
                        .exposeIdsFor(Hashtag.class)
        );
    }

}