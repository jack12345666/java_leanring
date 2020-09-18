package com.practice;

public class Demo04 {
    /**
     * 范围越大的类型，占的空间越大，随意需要按需选择。在基本类型中，他们之前是可以转换的，
     * 一个算式计算完之后，结果会自动转换成高级别的类型。
     * 级别的从高到底为：双精度型(double)>浮点型(float)>长整型(long)>整形(int)>byte。
     * 上面的算式中包含了整形（b、c、d）、和浮点型（a），
     * 其中级别最高的是float，所以最后计算的结果会自动转换成float，需要用float型接收
    */
    public static void main(String[] args) {
        float a = 333.5f;
        int b = 992;
        int c = 1231;
        int d = 2;
        float sum = a*(b + c/d);
        System.out.println("计算 335 * (992 + 1231 / 2)");
        System.out.println(sum);
        System.out.println(a*(b + c/d));
    }
}
