package com;

/**
 * @ClassName : Audi  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-09-19 14:45  //时间
 */
public class Audi implements Car{
    public void start() {
        System.out.println("Audi start");
    }
    public void turnLeft() {
        System.out.println("Audi turnLeft");
    }
    public void turnRight() {
        System.out.println("Audi turnRight");
    }
    public void stop() {
        System.out.println("Audi stop");
    }
}