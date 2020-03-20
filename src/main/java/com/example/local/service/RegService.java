package com.example.local.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author: lou ke
 * @createDate: 2020/3/20 14:03
 * @version: 1.0
 */
@Service
public class RegService {
    public int reg(String username, String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        //调用 BCryptPasswordEncoder 的encode方法对密码进行加密处理
        String encodePassword = encoder.encode(password);
        // return saveToDb(username, encodePassword);
        return 2;
    }
}
