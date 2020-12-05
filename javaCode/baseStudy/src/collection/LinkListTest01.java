package collection;

/*
 * @Author jack
 * @Date 2020/12/1 9:21
 *
 * linkedList: 把随机增删发挥到极致
 *  添加元素都是往末尾添加，所以ArrayList用的比Linkedlist多
 **/

import java.util.LinkedList;
import java.util.List;

public class LinkListTest01 {
    public static void main(String[] args) {
        // LinkedList底层也是有下标的
        // 注意: ArrayList之所以检索效率比较高，不单是因为下标的原因。是因为底层数组发挥的作用
        // LinkedList集合照样有下标，但是检索/查找某个元素的时候效率比较低，因为只能从头节点开始一个一个遍历
        List list  = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // LinkedList集合有初始化容量吗？ 没有
        // 最初这个链表中没有任何元素。first和last引用都是null
        // 不管LinkedList还是ArrayList，以后写代码时不需要关心具体哪个集合
        // 因为我们要面向接口变成，调用的方法都是接口中的方法
    }
}