package com.fastcampus.projectBoard1.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Disabled("제외")
@DisplayName("Data rest 테스트")
@Transactional
@AutoConfigureMockMvc
@SpringBootTest
public class DataRestTest {
    private MockMvc mvc;
    public DataRestTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @DisplayName("api 게시글 리스트 조회")
    @Test
    void givenNothing_whenRequestingAtricles_thenReturnAtricles() throws Exception {
        mvc.perform(get("/api/articles"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")))
                .andDo(print());
    }


    @DisplayName("api 게시글 한 건 조회")
    @Test
    void givenArticleId_whenRequestingArticle_thenReturnThatArticle() throws Exception {
        String articleId = "<replace with actual Article ID>";

        mvc.perform(get("/api/articles/" + articleId))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")))
                .andDo(print());
    }

    @DisplayName("api 게시글 및 댓글 조회")
    @Test
    void givenArticleId_whenRequestingArticleAndComments_thenReturnArticleWithComments() throws Exception {
        String articleId = "<replace with actual Article ID>";

        mvc.perform(get("/api/articles/" + articleId + "/comments"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")))
                .andDo(print());
    }
}
