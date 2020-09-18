package com.practice;

import java.util.Date;

public class Demo10 {
    public static void main(String[] args) {
        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(1000*3); // 休眠3秒
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
