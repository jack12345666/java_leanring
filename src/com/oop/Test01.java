package com.oop;

class Super {
    public void move() {
        System.out.println("动物跑");
    }
}

class Cat extends Super {
    public void move() {
        super.move();
        System.out.println("猫可以跑");
    }
}

public class Test01 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.move();
    }
}
