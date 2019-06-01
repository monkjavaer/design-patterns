package com.pattern.proxy.staticproxy;

/**
 * 代理类
 * @author monkjavaer
 * @date 2018/09/05 22:20
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void seeMovie() {
        System.out.println("Proxy:加广告");
        subject.seeMovie();
        System.out.println("Proxy:加广告");
    }
}
