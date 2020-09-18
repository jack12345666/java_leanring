package com.jihe;

import java.util.HashSet;

public class Test04 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("sdasd");
        hashSet.add("12312");
        hashSet.add("递四方速递");
        System.out.println("set大小：" + hashSet.size());

        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
