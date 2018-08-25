package com.pattern.factory.simple;

import com.pattern.factory.Pizza;
import com.pattern.factory.Type;

/**
 * 简单披萨工厂
 * @author tangquanbin
 * @date 2018/08/25 11:03
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (Type.cheese.name.equals(type)){
            pizza = new CheesePiza();
        }
        if (Type.clam.name.equals(type)){
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
