package com.practice;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Demo09 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println("当前时间为："+ ft.format(dNow));

        // 使用printf格式化日期

        System.out.printf("全部日期和时间信息：%tc%n", date);
        System.out.printf("年-月-日格式：%tF%n",date);
        System.out.printf("月/日/年格式：%tD%n",date);
        System.out.printf("HH:MM:SS PM格式(12时制)：%tr%n",date);
        System.out.printf("HH:MM:SS PM格式(24时制)：%tT%n",date);
        System.out.printf("HH:MM格式(24时制)：%tR%n",date);

    }
}
