package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * @Author jack
 * @Date 2020/11/24 9:58
 *
 * 关于集合遍历/迭代专题
 *
 **/
public class CollectionTest02 {
    public static void main(String[] args) {
        // 注意： 以下讲解的遍历/迭代方式，是所有Collection通过的一种方式
        // 在Map集合中不能用。在所有的Collection以及子类中的使用
        // 创建对象
        Collection c = new ArrayList(); // 后面的集合无所谓，主要是看前面的Collection接口，怎么遍历/迭代
        // 添加元素
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());

        Iterator iterator = c.iterator();
        //  对集合Collection进行遍历，迭代集合
        //  第一步: 通过以上获取的迭代器对象开始迭代/遍历集合
        /*
         *  以下两个方法是迭代器对象Iterator中的方法:
         *  boolean hasNext()如果仍有元素可以迭代，则返回true
         *  Object next() 返回迭代的下一个元素
         **/
        while(iterator.hasNext()) {
            // 不管你当初存进去什么，取出来统一都是Object
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}