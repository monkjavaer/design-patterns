package com.pattern.observer.one;


/**
 * 主题接口
 * @author tangquanbin
 * @date 2018/08/18 14:35
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 当主题变化时，此方法被调用，通知所有观察者
     */
    void notifyObserver();

}
