package com.example.oauthdemo.service.impl;

import com.example.oauthdemo.bean.CustomUserDetails;
import com.example.oauthdemo.bean.User;
import com.example.oauthdemo.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    //暂时手动新增用户
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        return new CustomUserDetails(user);
    }
}
