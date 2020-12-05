package com.kangaroo.firstspringboot.config;

import com.kangaroo.firstspringboot.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public User user() {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        return user;
    }
}