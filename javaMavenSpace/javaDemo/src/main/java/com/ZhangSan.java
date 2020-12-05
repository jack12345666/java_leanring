package com;

/**
 * @ClassName : ZhangSan  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-09-19 14:55  //时间
 */
public class ZhangSan {
    private Car car;
    public ZhangSan(Car car) {
        this.car = car;
    }

    public void goHome() {
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }

    public void goShop() {
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }

}