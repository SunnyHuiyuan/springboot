package com.example.local.dao;

import com.example.local.model.Role;
import com.example.local.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: lou ke
 * @createDate: 2020/3/20 15:28
 * @version: 1.0
 */
@Mapper
public interface UserMapper {

    User loadUserByUsername(String username);

    List<Role> getUserRolesByUid(Integer id);
}
