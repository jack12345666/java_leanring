package com.practice;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Demo11 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        // 获得月份
        int month = c.get(Calendar.MONTH) + 1;
        System.out.println(month);

        GregorianCalendar c1 = new GregorianCalendar();
        int cYear = c1.get(Calendar.YEAR);
        if(c1.isLeapYear(cYear)) {
            System.out.println("当前年份是闰年");
        }else {
            System.out.println("当前年份不是闰年");
        }
    }
}
