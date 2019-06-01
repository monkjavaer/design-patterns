package com.pattern.observer.java;

import com.pattern.observer.one.Display;

import java.util.Observable;
import java.util.Observer;

/**
 * 目前天气状况展板
 * @author monkjavaer
 * @date 2018/08/18 15:11
 */
public class CrruentConditionDisply implements Display,Observer {
    /**
     * 温度
     */
    private Float temperature;
    /**
     * 湿度
     */
    private Float humidity;
    /**
     * 气压
     */
    private Float pressure;

    public CrruentConditionDisply(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("目前天气状况展板观察到天气变化，目前天气状况>>>温度："+temperature+";湿度："+humidity+";气压"+pressure);
    }

    /**
     * 数据更新的时候，调用display打印出来。
     * @param obs 被观察者
     * @param arg 这里使用pull,也可以通过push，arg参数传递(被观察者数据更新时就要调用notifyObservers(Object arg)方法 )
     */
    @Override
    public void update(Observable obs,Object arg) {
        if (obs instanceof WheatherData) {
            WheatherData wheatherData = (WheatherData) obs;
            this.temperature = wheatherData.getTemperature();
            this.humidity = wheatherData.getHumidity();
            this.pressure = wheatherData.getPressure();
            display();
        }

    }
}
