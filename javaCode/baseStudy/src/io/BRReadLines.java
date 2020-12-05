package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @Author jack
 * @Date 2020/11/13 14:15
 **/
public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.\n Enter 'end' to quit");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}