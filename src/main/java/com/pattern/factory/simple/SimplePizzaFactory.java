package com.pattern.factory.simple;

import com.pattern.factory.Pizza;

/**
 * 简单披萨工厂
 * @author tangquanbin
 * @date 2018/08/25 11:03
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if ("cheese".equals(type)){
            pizza = new CheesePiza();
        }
        if ("clam".equals(type)){
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
