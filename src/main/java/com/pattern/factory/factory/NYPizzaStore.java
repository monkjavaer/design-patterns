package com.pattern.factory.factory;

import com.pattern.factory.Pizza;
import com.pattern.factory.Type;

/**
 * 纽约加盟店
 * @author tangquanbin
 * @date 2018/08/25 21:00
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(Type.cheese.name.equals(type)){
            pizza = new NYCheesePizza();
        }
        return pizza;
    }
}
