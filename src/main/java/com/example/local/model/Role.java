package com.example.local.model;

/**
 * @author: lou ke
 * @createDate: 2020/3/20 14:57
 * @version: 1.0
 * <p>
 * 角色表实体类
 */

public class Role {
    private Integer id;
    private String name;
    private String nameZh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }
}
