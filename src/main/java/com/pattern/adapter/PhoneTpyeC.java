package com.pattern.adapter;

/**
 * 手机Type-c接口
 * @author tangquanbin
 * @date 2018/08/29 21:45
 */
public class PhoneTpyeC implements TypeC {

    @Override
    public void isTypeC() {
        System.out.println("我是手机Type-C接口");
    }
}
