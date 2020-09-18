package com.oop;

public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("员工A", "北京", 3, 3600.00);
        Employee e = new Salary("员工B", "上海", 2, 2400.00);
        s.mailCheck();
        s.computePay();
        System.out.println("\n");
        e.mailCheck();
    }
}
