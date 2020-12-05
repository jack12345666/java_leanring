package collection;

import java.util.HashSet;
import java.util.Set;

/*
 * @Author jack
 * @Date 2020/12/3 14:22
 *
 *  HashSet集合:
 *    无序不可重复
 **/
public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> strs = new HashSet<>();
        strs.add("hello1");
        strs.add("hello1");
        strs.add("hello5");
        strs.add("hello8");
        strs.add("hello7");
        strs.add("hello2");


        /*
         1. 存储是顺序和取出的顺序不同
         2. 不可重复
         3. 放到HashSet集合中的元素实际上是放到HashMap集合的key部分
         **/
        for (String s : strs) {
            System.out.println(s);
        }
    }
}