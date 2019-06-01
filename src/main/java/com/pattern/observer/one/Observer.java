package com.pattern.observer.one;

/**
 * 观察者接口
 * @author monkjavaer
 * @date 2018/08/18 14:38
 */
public interface Observer {

    /**
     * 当观测值改变时，主题会把这些值传递给观察者。
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(Float temp,Float humidity,Float pressure);
}
