package com.obj;

public class Test02 {
    static int a = 1;
    int b = 2;

    public static void a() {
        System.out.println(a);
    }

    public int b() {
        return b;
    }

    public static void main(String[] args) {
        a();
        Test02 obj = new Test02();
        int x = obj.b();
        System.out.println(x);
    }
}