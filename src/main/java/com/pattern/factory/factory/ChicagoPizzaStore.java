package com.pattern.factory.factory;

import com.pattern.factory.Pizza;

/**
 * 芝加哥加盟店
 * @author tangquanbin
 * @date 2018/08/25 21:08
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new ChicagoCheesePizza();
        }
        return pizza;
    }

}
