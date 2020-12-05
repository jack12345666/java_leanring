package collection;


public class GenericTest03<T> {

    public void doSome() {
        System.out.println("doSome");
    }
    public static void main(String[] args) {
       GenericTest03<String> gt = new GenericTest03<>();
       gt.doSome();
    }
}