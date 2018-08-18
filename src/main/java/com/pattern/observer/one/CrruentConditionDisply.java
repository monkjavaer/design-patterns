package com.pattern.observer.one;

/**
 * 目前天气状况展板
 * @author tangquanbin
 * @date 2018/08/18 15:11
 */
public class CrruentConditionDisply implements Display,Observer{
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
    /**
     * Subject引用，方便取消注册
     */
    private Subject wheatherData;

    public Subject getWheatherData() {
        return wheatherData;
    }

    public CrruentConditionDisply(Subject wheatherData) {
        this.wheatherData = wheatherData;
        wheatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("目前天气状况展板观察到天气变化，目前天气状况>>>温度："+temperature+";湿度："+humidity+";气压"+pressure);
    }

    /**
     * 数据更新的时候，调用display打印出来。
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    @Override
    public void update(Float temp, Float humidity, Float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
