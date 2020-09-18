package com.practice;

public class Demo03 {
    public static void main(String[] args) {
        byte b = 3;//范围是-128~127之间
        short s = -200;//短整型，范围是-32768~32767之间
        int i = 1000;//整型，范l围是负的2的31次方到正的2的31次方减1
        long l = -999999999; //长整型，范围为负的2的63次方到正的2的63次方减1
        float f = 6.12f; //浮点型，就是带小数点的数。范围在3.4e-45~1.4e38，直接赋值时必须在数字后加上f或F。
        double d = 10.23d; //双精度型，就是比float的范围更大的带小数点的数。范围在4.9e-324~1.8e308，赋值时必须在数字后加上d或D。
        boolean bool = true; //布尔型，只有true（真）和false（假）两个取值
        char c = 'A'; //用单引号赋值,只能存一个字符

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(c);

    }
}
