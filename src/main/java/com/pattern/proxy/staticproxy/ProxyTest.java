package com.pattern.proxy.staticproxy;

/**
 * 测试
 * @author tangquanbin
 * @date 2018/09/05 22:22
 */
public class ProxyTest {
    public static void main(String[] args) {

        Proxy proxy = new Proxy(new RealSubject());
        proxy.seeMovie();

    }
}
