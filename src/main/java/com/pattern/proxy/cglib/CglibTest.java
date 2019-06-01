package com.pattern.proxy.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * http://jnb.ociweb.com/jnb/jnbNov2005.html
 * http://m635674608.iteye.com/blog/1435221
 * http://www.cnblogs.com/jqyp/archive/2010/08/20/1805041.html
 * http://www.iteye.com/topic/1116696
 * http://shensy.iteye.com/blog/1881130
 * @author monkjavaer
 * @date 2018/9/6 13:59
 */
public class CglibTest {
    public static void main(String[] args) {

        MyCglibInterceptor proxy = new MyCglibInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MySubject.class);
//        enhancer.setCallback(new MyCglibInterceptor());
        enhancer.setCallbacks(new Callback[]{proxy,NoOp.INSTANCE});
        enhancer.setCallbackFilter(new MyCallbackFilter());

        MySubject mySubject = (MySubject) enhancer.create();
        mySubject.getStart();
        mySubject.save();
    }
}
