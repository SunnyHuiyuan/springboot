package com.example.local.controller;

import com.example.local.service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lou ke
 * @createDate: 2020/3/20 8:45
 * @version: 1.0
 */
@RestController
public class HelloController {

    @Autowired
    MethodService methodService;

    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }

    @GetMapping("/admin/hello")
    public String admin() {
        return "hello admin!";
    }

    @GetMapping("/user/hello")
    public String user() {
        return "hello user!";
    }

    @GetMapping("/db/hello")
    public String dba() {
        String out = methodService.dba();
        return out;
    }

}
