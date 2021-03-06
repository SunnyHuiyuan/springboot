package com.example.local.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 * @author: lou ke
 * @createDate: 2020/3/20 14:11
 * @version: 1.0
 */
@Service
public class MethodService {
    @Secured("ROLE_ADMIN")
    public String admin() {
        return "hello admin";
    }

    @PreAuthorize("hasRole('ADMIN') and hasRole('DBA')")
    public String dba() {
        return "hello dba";
    }

    @PreAuthorize("hasAnyRole('ADMIN','DBA','USER')")
    public String user() {
        return "hello user";
    }
}
