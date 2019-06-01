package com.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 * @author monkjavaer
 * @date 2018/8/31 15:39
 */
public class InvocationHandlerImpl implements InvocationHandler {

    /**
     * 代理的对象
     */
    private Object object;

    public InvocationHandlerImpl(Object object) {
        this.object = object;
    }

    /**
     *
     * @param proxy JDK动态生成的最终代理对象
     * @param method 调用真实对象的某个方法的Method对象
     * @param args 调用真实对象某个方法时接受的参数
     * @return 代理对象
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before:把饭做好");

        //当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object invokeObject = method.invoke(object, args);

        System.out.println("after:洗碗");
        return invokeObject;
    }
}
