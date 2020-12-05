package org.example.di02;

/**
 * @ClassName : School  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-09-23 10:31  //时间
 */
public class School {
    private String name;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}