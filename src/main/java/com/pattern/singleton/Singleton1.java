package com.pattern.singleton;

/**
 * 饿汉模式(创建和运行负担小，占用内存小时使用)
 * @author monkjavaer
 * @date 2018/08/27 21:44
 */
public class Singleton1 {

    private static Singleton1 instance = new Singleton1();
    private Singleton1(){}
    public static Singleton1 getInstance(){
        return instance;
    }

}
