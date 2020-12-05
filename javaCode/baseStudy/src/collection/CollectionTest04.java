package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String a = "abc";
        String b = "def";
        c.add(a);
        c.add(b);

        String x = "abc";
        // contains 底层使用 equals比较的
        System.out.println("集合contains:"+ c.contains(x));
    }
}