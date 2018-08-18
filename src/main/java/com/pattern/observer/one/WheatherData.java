package com.pattern.observer.one;

import java.util.ArrayList;

/**
 * 气象站
 * @author tangquanbin
 * @date 2018/08/18 14:49
 */
public class WheatherData implements Subject {
    /**
     * 记录观察者
     */
    private ArrayList<Observer> observers;
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

    public WheatherData() {
        this.observers = new ArrayList<>();
    }

    /**
     * 注册
     * @param observer 观察者
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除
     * @param observer 观察者
     */
    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index>=0){
            observers.remove(index);
        }
    }

    /**
     * 通知
     */
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 气象站天气数据更新
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(Float temperature,Float humidity,Float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //更新数据后调用通知方法
        notifyObserver();
    }

}
