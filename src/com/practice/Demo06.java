package com.practice;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        int[] numArr = new int[]{1, 2, 3};
        numArr[0] = 123;
        System.out.println(Arrays.toString(numArr));
    }
}
