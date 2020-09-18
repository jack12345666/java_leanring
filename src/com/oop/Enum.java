package com.oop;

import java.awt.*;

public class Enum {
    enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        for (Color myVar : Color.values()) {
            System.out.println(myVar);
        }
    }
}
