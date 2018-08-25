package com.pattern.factory.factory;

import com.pattern.factory.Pizza;

/**
 * 纽约口味芝士披萨
 * @author tangquanbin
 * @date 2018/08/25 21:05
 */
public class NYCheesePizza extends Pizza {

    public NYCheesePizza(){
        name = "NYCheesePizza";
        dough = "Thin crust dough NYCheesePizza";
        sauce = "Marina sauce NYCheesePizza";
        toppings.add("Grated NYCheesePizza cheese");
    }

    @Override
    public void cut(){
        System.out.println("cut it into NYCheesePizza slices");
    }
}
