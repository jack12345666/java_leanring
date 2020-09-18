package com.oop;

class Animal {
    public void eat() {
        System.out.println("animal: eat");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("dog: eat");
    }
    public void eatTest() {
        this.eat(); // 调用自己的方法
        super.eat(); // super调用父类的方法
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Dog d = new Dog();
        d.eatTest();
    }
}
