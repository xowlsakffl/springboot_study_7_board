package com.fastcampus.projectBoard1.repository;

import com.fastcampus.projectBoard1.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}