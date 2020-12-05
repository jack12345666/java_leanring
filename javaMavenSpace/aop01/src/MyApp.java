import com.aop.handler.MyInvocationHandler;
import com.aop.service.SomeService;
import com.aop.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
        SomeService target = new SomeServiceImpl();
        InvocationHandler handler = new MyInvocationHandler(target);

        SomeService proxy = (SomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), handler
        );
        proxy.doSome();
        System.out.println("===================");
        proxy.doOther();

    }
}