package com.jihe;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        // 声明一个ArrayList
        ArrayList arr = new ArrayList();

        arr.add(2);
        arr.add('b');
        arr.add("abc");

        String i = (String) arr.get(2);
        System.out.println(i);
    }
}
