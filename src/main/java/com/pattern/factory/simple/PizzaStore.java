package com.pattern.factory.simple;

import com.pattern.factory.Pizza;

/**
 * 披萨店
 * @author monkjavaer
 * @date 2018/08/25 11:32
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
