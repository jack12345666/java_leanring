package collection;
/*
 * @Author jack
 * @Date 2020/12/1 9:47
 *
 * Vector:
 *    1. 底层也是数组
 *    2. 初始化容量： 10
 *    3. 扩容之后是原容量的2倍
 *    4. Vector中所有的方法都是线程同步的，都带有synchronized关键字，是线程安全的
 *       效率比较低，用的较少
 *
 *   怎样将一个线程不安全的ArrayList集合转换成线程安全的呢？
 *     使用集合工具类：
 *       java.util.Collections
 *
 *       java.util.Collection 是集合接口
 *       java.util.Collections 是集合工具类
 *
 **/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VectorTest {
    public static void main(String[] args) {
        List myList = new ArrayList<>(); // 非线程安全的
        // 变成线程安全的
        Collections.synchronizedList(myList);

        myList.add(111);
        myList.add(222);
        myList.add(333);
    }
}