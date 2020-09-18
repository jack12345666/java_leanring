package com.oop;

public class SubPerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("jack");
        p.setAge(18);

        System.out.print("Name: " + p.getName() + " Age: " + p.getAge());
    }
}
