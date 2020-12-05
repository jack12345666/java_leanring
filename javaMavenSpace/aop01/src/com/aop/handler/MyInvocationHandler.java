package com.aop.handler;

import com.aop.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName =  method.getName();
        Object res = null;

        if("doSome".equals(methodName)) {
            ServiceTools.doLog();
            res = method.invoke(target, args);
            ServiceTools.doTrans();
        }else {
            res = method.invoke(target, args);
        }

        return res;
    }
}