package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest07 {
    public static void main(String[] args) {
        Collection cc = new ArrayList();
        String s1 = "hello";
        cc.add(s1);

        String s2 = "hello";
        cc.remove(s2);

        System.out.println(cc.size()); // 0
    }
}