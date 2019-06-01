package com.pattern.singleton;

/**
 *
 * 懒汉模式（处理多线程）synchronized同步会降低性能。
 * @author monkjavaer
 * @date 2018/08/27 22:21
 */
public class Singleton3 {
    private  static  Singleton3 instance ;
    private Singleton3(){}
    public static synchronized Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
