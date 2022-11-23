package com.exercise.passwordEncrypt.controller;

import com.exercise.passwordEncrypt.entity.Login;
import com.exercise.passwordEncrypt.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/saveUsers")
    public void saveTest(@RequestBody Login login) {
        loginService.save(login);
    }
}

