package com.pattern.factory.factory;

import com.pattern.factory.Pizza;

/**
 * 给披萨店使用框架，方便各地加盟店
 *
 * @author monkjavaer
 * @date 2018/08/25 20:55
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    /**
     * 把工厂对象移到这个地方,每个加盟店都要实现这个抽象工厂方法
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);
}