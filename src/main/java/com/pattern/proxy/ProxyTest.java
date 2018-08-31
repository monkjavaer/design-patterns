package com.pattern.proxy;

import java.lang.reflect.Proxy;

/**
 * 小明吃饭
 * @author tangquanbin
 * @date 2018/8/31 15:53
 */
public class ProxyTest {
    public static void main(String[] args) {
        People xiaoMing = new XiaoMing();
        InvocationHandlerImpl handler1 = new InvocationHandlerImpl(xiaoMing);
        ClassLoader classLoader1 = xiaoMing.getClass().getClassLoader();
        Class[] interfaces1 = xiaoMing.getClass().getInterfaces();
        People people1 = (People) Proxy.newProxyInstance(classLoader1, interfaces1, handler1);
        people1.eat();
    }
}
