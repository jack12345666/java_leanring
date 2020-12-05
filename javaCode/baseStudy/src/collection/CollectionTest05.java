package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        User u1 = new User("jack");
        c.add(u1);

        User u2 = new User("jack");

        System.out.println("集合contains：" + c.contains(u2)); // false

        System.out.println("u1 equals u2:" + u1.equals(u2)); // false
    }
}

class User {
    private String name;
    public User() {}
    public User(String name) {
        this.name = name;
    }

    // 重写equals方法

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}