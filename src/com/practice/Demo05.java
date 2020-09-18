package com.practice;

public class Demo05 {
    public static void main(String[] args) {
        int i = 99;
        long l = 888888888888888888l; //定义一个长整型
        double d = 4234.1312; //定义一个双精度型
        float f =3.1415555555555f; //定义一个浮点型


//        l = i;
//        d = i;
//        f = i;
//        System.out.println(l); // 99
//        System.out.println(d); // 99.0
//        System.out.println(f); // 99.0
          i = (int) l;
          System.out.println(i);

          i = (int) d;
         System.out.println(i);

          i = (int) f;
        System.out.println(i);
    }
}
