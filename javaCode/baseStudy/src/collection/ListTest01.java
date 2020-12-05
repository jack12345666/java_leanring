package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * @Author jack
 * @Date 2020/11/30 14:05
 *
 * 1.List集合存储元素特点： 有序可重复
 *    有序： List集合中的元素有下标
 *    从0开始，以1递增
 * 2.List既然是Collection接口的子接口，那么List接口可定有自己“特色”的方法
 *   以下只列出List接口特有的常用的方法：
 *     void add(int index, Object o)
 *     Object get(int index)
 *     int indexOf(Object o)
 *     int lastIndexOf(Object o)
 *     Object remove(int index)
 *     Object set(int index, Object o)
 **/
public class ListTest01 {
    public static void main(String[] args) {
        List myList = new ArrayList<>();

        myList.add("A"); // 默认向集合末尾添加元素
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");
        // 在列表的指定位置插入元素（第一个参数是下标）
        // 这个方法使用不多，因为对于ArrayList集合来说效率比较低
        myList.add(1, "jack");
        // 迭代
        Iterator it = myList.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // 根据下标获取元素
        Object firstObj = myList.get(0);
        System.out.println("====第一个元素====  "+firstObj);

        // 因为有下标，所以List集合有自己比较特殊的遍历方式
        // 通过下标遍历 【List集合特有的方式，Set没有】
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // 获取指定对象第一次出现的索引
        System.out.println(myList.indexOf("jack"));

        // 获取指定对象最后一次出现的索引
        System.out.println(myList.lastIndexOf("C"));

        // 按照下标删除
        myList.remove(5);
        System.out.println(myList.size());

        // 修改指定的位置元素
        myList.set(0, "first");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}