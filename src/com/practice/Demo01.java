package com.practice;

import java.util.Scanner;

/**
 *Scanner工具类接收用户输入信息
 * 固定格式为：
 * String 变量 = new Scanner(System.in).next();
 * 或者
 * Int 变量 = new Scanner(System.in).nextInt();
 *
 */

public class Demo01 {
    public static void main(String[] args) {
        System.out.print("请输入用户初始分数：");
        int score = new Scanner(System.in).nextInt();
        int count = 0;
        System.out.println("加分前的成绩："+score);
        while(score<60) {
            score++;
            count++;
        }
        System.out.println("加分后的成绩："+score);
        System.out.println("加分次数："+count);
    }
}
