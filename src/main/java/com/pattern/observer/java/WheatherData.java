package com.pattern.observer.java;

import java.util.Observable;

/**
 * 气象站
 * @author monkjavaer
 * @date 2018/08/18 14:49
 */
public class WheatherData extends Observable {
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
        //数据改变啦
        setChanged();
        //调用通知方法
        notifyObservers();
    }

    public Float getTemperature() {
        return temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public Float getPressure() {
        return pressure;
    }
}
