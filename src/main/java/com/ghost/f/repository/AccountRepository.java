package com.ghost.f.repository;

import com.ghost.f.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {

}