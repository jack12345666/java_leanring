package com.obj;

public class Test03 {
    public static void main(String[] args) {
        String str1 = "avdsd";
        String str2 = "avdsd";
        String str3 = new String("avdsd");
        System.out.println("str1 == str2 "+ (str1 == str2));
        System.out.println("str1 == str3 "+ (str1 == str3));
        System.out.println(str1.equals(str3));
    }
}
