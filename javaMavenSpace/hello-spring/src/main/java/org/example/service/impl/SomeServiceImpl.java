package org.example.service.impl;

import org.example.service.SomeService;

/**
 * @ClassName : SomeServiceImpl  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-09-22 11:15  //时间
 */
public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome() {
        System.out.println("实现SomeService的doSome方法");
    }
}