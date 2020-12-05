package collection;

/*
 * @Author jack
 * @Date 2020/12/1 10:53
 *
 *  JDK5.0之后推出了一个新特性： 叫做增强for循环，或者叫做foreach
 *
 **/
public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr = {21, 322, 65, 87, 21};
        // foreach没有下标
        for(int item : arr) {
            System.out.println(item);
        }
    }
}
