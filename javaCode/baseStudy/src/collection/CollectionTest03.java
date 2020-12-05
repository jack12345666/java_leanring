package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest03 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c1 = new ArrayList();
        // 添加元素
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);

        // 迭代元素
        Iterator iterator = c1.iterator();
        while (iterator.hasNext()) {
            // 存进去是什么类型，取出来还是什么类型
            Object obj = iterator.next();
//            if(obj instanceof Integer) {
//                System.out.println("Integer类型");
//            }
            // 只不过在输出的时候会转成字符串。因为这里println会调用toString()方法
            System.out.println(obj);
        }

        // HashSet集合： 无序不可重复
        Collection c2 = new HashSet();
        c2.add(100);
        c2.add(100);
        c2.add(500);
        c2.add(300);

        Iterator iterator1 = c2.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }

}