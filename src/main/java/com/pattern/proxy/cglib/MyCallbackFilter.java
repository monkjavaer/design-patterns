package com.pattern.proxy.cglib;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * 使用Cglib定义不同的拦截策略
 * @author monkjavaer
 * @date 2018/9/6 15:47
 */
public class MyCallbackFilter implements CallbackFilter {
    @Override
    public int accept(Method method) {
       if ("save".equals(method.getName())){
           return 1;
       }
       return 0;
    }
}
