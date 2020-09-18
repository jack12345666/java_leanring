package com.oop;

public class Penguin extends Animals {
    public Penguin(String myName, int myId) {
        super(myName, myId);
    }
    public static void main(String[] args) {
        Penguin p = new Penguin("企鹅", 18);
        p.eat();
    }
}

