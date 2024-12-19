package com.fastcampus.projectBoard1.config;

import com.fastcampus.projectBoard1.domain.UserAccount;
import com.fastcampus.projectBoard1.repository.UserAccountRepository;
import org.mockito.BDDMockito;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyString;

@Import(SecurityConfig.class)
public class TestSecurityConfig {
    @MockitoBean
    private UserAccountRepository userAccountRepository;

    @BeforeTestMethod // 인증 관련 테스트 메소드 실행전에 호출됨
    public void securitySetUp(){
        BDDMockito.given(userAccountRepository.findById(anyString())).willReturn(Optional.of(UserAccount.of(
                "amsTest",
                "pw",
                "ams@kakao.com",
                "AN",
                "test-memo"
        )));
    }
}
