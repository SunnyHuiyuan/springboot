package com.example.local.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author: lou ke
 * @createDate: 2020/3/20 14:58
 * @version: 1.0
 * <p>
 * 用户表实体类
 */

public class User implements UserDetails {

    private Integer id;         //id
    private String username;    //用户名
    private String password;    //密码
    private Boolean enabled;    //是否可用
    private Boolean locked;     //是否被锁定
    private List<Role> roles;   //所具备的角色

    //获取当前用户对象所具有的角色信息
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    //获取当前用户对象的密码
    @Override
    public String getPassword() {
        return password;
    }

    //获取当前用户对象的用户名
    @Override
    public String getUsername() {
        return username;
    }

    //当前账户是否未过期
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //当前账户是否未锁定
    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    //当前账户密码是否未过期
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    //当前账户是否可用
    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
