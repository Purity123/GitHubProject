package com.example.oauthdemo.bean;

import org.springframework.security.core.userdetails.User;

import java.util.Collections;

public class CustomUserDetails extends User {
    private com.example.oauthdemo.bean.User user;

    public CustomUserDetails(com.example.oauthdemo.bean.User user) {
        super(user.getUsername(), user.getPassword(), true, true, true, true, Collections.EMPTY_SET);
        this.user = user;
    }

    public com.example.oauthdemo.bean.User getUser() {
        return user;
    }

    public void setUser(com.example.oauthdemo.bean.User user) {
        this.user = user;
    }
}
