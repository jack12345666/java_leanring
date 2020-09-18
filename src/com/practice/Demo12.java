package com.practice;

import java.util.regex.Pattern;

public class Demo12 {
    public static void main(String[] args) {
        String str = "I am jack from runoob.com";
        String pattern = ".*runoob.*";
        String isMatch = Pattern.matches(pattern, str) ? "是" : "否";
        System.out.println("字符串是否包含了 'runoob' 子字符串？ " + isMatch);
    }
}
