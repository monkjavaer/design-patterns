package com.pattern.singleton;

/**
 * 懒汉模式
 * (懒汉模式并没有考虑线程安全问题，
 * 在多个线程可能会并发调用它的getInstance()方法，
 * 导致创建多个实例.)
 * @author monkjavaer
 * @date 2018/08/27 22:14
 */
public class Singleton2 {
    private static  Singleton2 instance ;
    private Singleton2(){}
    public static Singleton2 getInstance(){
        if (instance ==null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
