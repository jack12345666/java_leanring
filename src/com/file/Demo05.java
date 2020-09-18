package com.file;

import java.io.File;

public class Demo05 {
    public static void main(String[] args) {
        File f = new File("test");
        f.delete();
    }
}
