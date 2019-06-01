package com.pattern.singleton;

/**
 * 用“双重检查加锁”，在getIntance()中减少使用同步
 * 利用双重检查加锁，首先检查是否实例已经创建，如果没有才同步。
 * 这样只有第一次才会同步。
 * @author monkjavaer
 * @date 2018/08/27 22:28
 */
public class Singleton4 {
    private volatile static  Singleton4 instance;

    private Singleton4(){}

    public static Singleton4 getInstance(){
        //如果实例不存在，进入同步区
        if (instance == null){
            //只有第一次才执行
            synchronized (Singleton4.class){
                //进入区块再检查一次
                if (instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

}
