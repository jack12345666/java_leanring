package com.obj;

public class Child extends Parent {
    public void p() {
        System.out.println("我是Child类");
    }
    public void test() {
        p();
        super.p();
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.test();
    }
}
