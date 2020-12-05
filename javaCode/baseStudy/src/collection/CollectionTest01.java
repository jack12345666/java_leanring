package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * @Author jack
 * @Date 2020/11/24 9:16
 * 关于java.util.Collection接口中常用的方法
 *    1.Collection中能存放什么元素
 *      没有使用“泛型”之前,Collection中可以存储Object的所有子类型
 *      使用了“泛型”之后，Collection中只能存储某个具体的类型
 *      集合后期我们会学习"泛型"语法。目前先不用管，什么都能存，
 *      只要是Object的子类型就行(集合中不能存储基本数据类型,也不能存java对象，知识存储java对象的内存地址)
 *    2.Collection常用方法
 *     boolean add(Object e)向集合中添加元素
 *     int size() 获取集合中元素的个数
 *     void clear() 清空集合
 *     boolean contains(Object o) 判断当前集合中是否包含元素o
 *     boolean remove(Object o) 删除集合中某个元素
 *     Object[] toArray() 将集合转换成数组
 *
 **/
public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(123); // 自动装箱,实际上是放进去一个对象内存地址
        c.add(true);
        c.add(new Object());

        // 获取集合中元素的个数
        System.out.println("集合中元素的个数是：" + c.size());

        // 清空集合
        c.clear();
        System.out.println("集合种元素个数是：" + c.size());

        // 再向集合中添加元素
        c.add("hello"); // "hello"对象的内存地址放到了集合当中
        c.add("world");
        c.add("婷婷");
        c.add(1);

        // 判断集合中是否包含"hello"
        boolean hello = c.contains("hello");
        System.out.println(hello);

        // 删除集合中某个元素
        c.remove(1);

        // 判断集合中元素个数是否为0
        System.out.println("集合是否为空:" + c.isEmpty());
        c.clear();
        System.out.println("集合是否为空:" + c.isEmpty());

        c.add("adsfds");
        c.add("21");
        c.add("ad34sfds");

        // 转换成数组
        Object[] objs = c.toArray();
        for (int i = 0; i < objs.length; i++) {
            // 遍历数组
            Object o = objs[i];
            System.out.println(o);
        }

    }
}