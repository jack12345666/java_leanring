package com.jihe;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("abc");
        strList.add("fgsdfg");
        strList.add("当时的成绩的");
        strList.add("dkdc");
        strList.add("1312");

        for(int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i)+ ' ');
        }
    }
}
