package com.jihe;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("abc");
        strList.add("dffsedf");

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(2);

        String str1 = strList.get(0);
        int int1 = intList.get(0);

        System.out.println(str1 + " " + int1);
    }
}
