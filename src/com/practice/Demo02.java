package com.practice;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        int classNum = 3; // 班级数量
        int stuNum = 4; //每个班级学生数量
        int sum = 0; // 每个班级成绩总和
        double avg = 0; // 成绩平均分
        for (int i = 1; i <= classNum; i++) {
            System.out.println("***请输入第"+ i +"个班级的成绩***");
            for (int j = 1;  j <= stuNum; j++) {
                System.out.print("请输入第"+ j + "个学员的成绩：");
                int score = new Scanner(System.in).nextInt();
                sum += score;
                avg = sum/stuNum;
            }
            System.out.println("第"+ i +"个班级成绩总和为："+sum + " 班级成绩平均分为："+avg);
            sum = 0;
            avg = 0;
        }
    }
}
