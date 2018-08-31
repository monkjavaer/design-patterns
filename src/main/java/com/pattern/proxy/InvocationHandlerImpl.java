package com.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 * @author tangquanbin
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

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before:把饭做好");
        Object invokeObject = method.invoke(object, args);
        System.out.println("after:洗碗");
        return invokeObject;
    }
}
