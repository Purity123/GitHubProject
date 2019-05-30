package com.example.oauthdemo.config;

import org.springframework.security.crypto.password.PasswordEncoder;
/**
 * spring-security5 以上，需要有密码验证器
 * */
public class CustomPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
