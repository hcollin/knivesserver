package com.frosttroll.knives.entity;

import com.frosttroll.knives.enums.UserFlags;

import java.util.List;

public class User {

    private Integer id;
    private String name;
    private String email;
    private String passwd;
    private List<UserFlags> flags;


    public User() {
    }

    public User(Integer id, String name, String email, String passwd, List<UserFlags> flags) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passwd = passwd;
        this.flags = flags;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer userId) {
        this.id = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public List<UserFlags> getFlags() {
        return flags;
    }

    public void setFlags(List<UserFlags> flags) {
        this.flags = flags;
    }
}
