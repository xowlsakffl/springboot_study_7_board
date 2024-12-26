package com.fastcampus.projectBoard1.config;

import com.fastcampus.projectBoard1.domain.UserAccount;
import com.fastcampus.projectBoard1.dto.UserAccountDto;
import com.fastcampus.projectBoard1.repository.UserAccountRepository;
import com.fastcampus.projectBoard1.service.UserAccountService;
import org.mockito.BDDMockito;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@Import(SecurityConfig.class)
public class TestSecurityConfig {
    @MockitoBean private UserAccountService userAccountService;

    @BeforeTestMethod
    public void securitySetUp() {
        given(userAccountService.searchUser(anyString()))
                .willReturn(Optional.of(createUserAccountDto()));
        given(userAccountService.saveUser(anyString(), anyString(), anyString(), anyString(), anyString()))
                .willReturn(createUserAccountDto());
    }

    private UserAccountDto createUserAccountDto() {
        return UserAccountDto.of(
                "amsTest",
                "pw",
                "ams@kakao.com",
                "AN",
                "test memo"
        );
    }
}
