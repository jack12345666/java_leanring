package com.aop.service.impl;

import com.aop.service.SomeService;
import com.aop.util.ServiceTools;

public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome() {
//        ServiceTools.doLog();
        System.out.println("执行业务doSome方法");
//        ServiceTools.doTrans();
    }

    @Override
    public void doOther() {
//        ServiceTools.doLog();
        System.out.println("执行业务doOther方法");
//        ServiceTools.doTrans();
    }
}