package com.pattern.factory.factory;

import com.pattern.factory.Pizza;
import com.pattern.factory.Type;

/**
 * @author tangquanbin
 * @date 2018/08/25 21:16
 */
public class PizzaBoot {

    public static void main(String[] args) {
        //从纽约和芝加哥加盟店分别订一份芝士披萨
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza nyPizza = nyStore.createPizza(Type.cheese.name);
        System.out.println(nyPizza.getName());
        Pizza chPizza = chicagoStore.createPizza(Type.cheese.name);
        System.out.println(chPizza.getName());
    }
}
