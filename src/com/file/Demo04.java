package com.file;

import java.io.File;

public class Demo04 {
    public static void main(String[] args) {
        String dirname = "test";
        File d = new File(dirname);
        d.mkdir();
    }
}
