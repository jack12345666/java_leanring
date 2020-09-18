package com.practice;

public class Demo08 {
    public static void main(String[] args) {
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println(helloString); // runoob

        String site = "www.runoob.com";
        int len = site.length();
        System.out.println("菜鸟教程网址长度为："+ len);

        String str1 = "我的名字是 ";
        System.out.println(str1.concat("Jack"));

    }
}
