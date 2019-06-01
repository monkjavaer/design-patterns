package com.pattern.proxy;

import java.lang.reflect.Proxy;

/**
 * 小明吃饭
 * @author monkjavaer
 * @date 2018/8/31 15:53
 */
public class ProxyTest {
    public static void main(String[] args) {
        People people = new XiaoMing();
        InvocationHandlerImpl handler1 = new InvocationHandlerImpl(people);
        //类加载器
        ClassLoader classLoader1 = people.getClass().getClassLoader();
        //得到全部的接口
        Class[] interfaces1 = people.getClass().getInterfaces();
        //返回代理类的一个实例
        People peopleProxy = (People) Proxy.newProxyInstance(classLoader1, interfaces1, handler1);

        peopleProxy.eat();
    }
}
