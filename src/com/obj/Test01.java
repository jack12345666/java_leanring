package com.obj;

public class Test01 {
    int a = 10;
    int b = 5;

    public int jiSuan() {
        int sum = a + b;
        System.out.println("a+b= " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Test01 jiSuan = new Test01();

        int x = jiSuan.jiSuan();
        System.out.println(x);

        System.out.println("a = "+jiSuan.a);

        jiSuan.a = 6666;
        System.out.println("a= "+jiSuan.a);
    }
}
