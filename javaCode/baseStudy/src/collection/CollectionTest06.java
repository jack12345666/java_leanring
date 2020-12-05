package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest06 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add('2');
        c.add(3);
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            // 编写代码时next()方法返回值必须是Object
            // Object obj = iterator.next();
            System.out.println(iterator.next());
        }
    }
}