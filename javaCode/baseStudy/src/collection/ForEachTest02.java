package collection;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest02 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("world");
        strList.add("hi");

        for(String item : strList) {
            System.out.println(item);
        }
    }
}