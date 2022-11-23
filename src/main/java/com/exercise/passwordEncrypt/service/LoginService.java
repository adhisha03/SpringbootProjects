package com.exercise.passwordEncrypt.service;

import com.exercise.passwordEncrypt.entity.Login;
import com.exercise.passwordEncrypt.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private  LoginRepository loginRepository;

    public String save(Login login) {
        login.setAndEncryptPassword(login.getPassword());
        loginRepository.save(login);
        return "saved";
    }
}
