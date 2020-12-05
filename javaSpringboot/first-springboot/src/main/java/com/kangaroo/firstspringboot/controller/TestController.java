package com.kangaroo.firstspringboot.controller;

import com.kangaroo.firstspringboot.entity.User;
import com.kangaroo.firstspringboot.properties.AliyunProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private User user;

    @GetMapping("/test")
    public String test() {
        return "hello SpringBoot!";
    }

    @GetMapping("/user")
    public User user() {
        return user;
    }

    @Value("${picPath}")
    private String picPath;

    @GetMapping("/picPath")
    public String pivPath() {
        return picPath;
    }

    @Autowired
    private AliyunProperties properties;

    @GetMapping("/aliyun")
    public AliyunProperties properties() {
        return properties;
    }

}