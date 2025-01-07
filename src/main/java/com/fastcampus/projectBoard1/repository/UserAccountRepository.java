package com.fastcampus.projectBoard1.repository;

import com.fastcampus.projectBoard1.domain.UserAccount;
import com.fastcampus.projectBoard1.domain.projection.UserAccountProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = UserAccountProjection.class)
public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}