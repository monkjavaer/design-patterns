package com.pattern.singleton;

/**
 * @author monkjavaer
 * @version V1.0
 * @date 2019/8/24 0024 11:09
 */
public class SingletonInnerClass {

    private static class SingletonHolder{
        private static SingletonInnerClass instance = new SingletonInnerClass();
    }
    private SingletonInnerClass(){}

    public static SingletonInnerClass getInstance(){
        return SingletonHolder.instance;
    }

}
