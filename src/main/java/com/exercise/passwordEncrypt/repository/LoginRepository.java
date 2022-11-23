package com.exercise.passwordEncrypt.repository;

import com.exercise.passwordEncrypt.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer> {
}
