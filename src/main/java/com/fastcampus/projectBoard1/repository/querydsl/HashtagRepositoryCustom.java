package com.fastcampus.projectBoard1.repository.querydsl;

import java.util.List;

public interface HashtagRepositoryCustom {
    List<String> findAllHashtagNames();
}