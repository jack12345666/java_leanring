package com.jihe;

import java.util.ArrayList;
import java.util.Collections;

public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<>();
        sites.add("taobao");
        sites.add("baidu");
        sites.add("weibo");
        sites.add("douyu");
        sites.add("huya");
        Collections.sort(sites); // 字母排序

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(32);
        nums.add(54);
        nums.add(312);
        nums.add(75);
        Collections.sort(nums); // 数字排序

        for(String i : sites) {
            System.out.println(i);
        }

        for (Integer j : nums) {
            System.out.println(j);
        }
    }
}
