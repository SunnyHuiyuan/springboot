package com.example.local.controller;

import com.example.local.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lou ke
 * @createDate: 2020/3/20 16:08
 * @version: 1.0
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/**")
    public void user(String username) {
        userService.loadUserByUsername(username);
    }
}
