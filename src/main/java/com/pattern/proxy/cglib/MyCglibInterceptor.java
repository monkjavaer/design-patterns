package com.pattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author tangquanbin
 * @date 2018/9/6 13:56
 */
public class MyCglibInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before=====do something");
        methodProxy.invokeSuper(object,objects);
        System.out.println("after=====do something");
        return object;
    }
}
