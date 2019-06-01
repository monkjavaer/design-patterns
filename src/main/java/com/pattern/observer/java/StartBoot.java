package com.pattern.observer.java;


/**
 * 启动气象站
 * @author monkjavaer
 * @date 2018/08/18 15:24
 */
public class StartBoot {
    public static void main(String[] args) {
        //建一个气象站
        WheatherData wheatherData = new WheatherData();
        //建一个天气展板
        CrruentConditionDisply crruentConditionDisply = new CrruentConditionDisply(wheatherData);
        //气象站天气数据更新
        wheatherData.setMeasurements(35.01f,26.01f,1000.01f);
        //取消注册
        wheatherData.deleteObserver(crruentConditionDisply);
        //气象站天气数据更新将不会收到
        wheatherData.setMeasurements(15.01f,16.01f,2000.01f);
    }
}
