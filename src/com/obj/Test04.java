package com.obj;

public class Test04 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long begin = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++) {
            sb.append(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("用时："+(end - begin));
    }
}
