package com.pattern.proxy.staticproxy;

/**
 * @author tangquanbin
 * @date 2018/09/05 22:19
 */
public class RealSubject implements Subject{

    @Override
    public void seeMovie() {
        System.out.println("RealSubject：看电影");
    }
}
