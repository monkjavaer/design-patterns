package com.pattern.factory.factory;

import com.pattern.factory.Pizza;

/**
 * 芝加哥口味芝士披萨
 * @author tangquanbin
 * @date 2018/08/25 21:06
 */
public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza(){
        name = "ChicagoCheesePizza";
        dough = "Thin crust dough ChicagoCheesePizza";
        sauce = "Marina sauce ChicagoCheesePizza";
        toppings.add("Grated ChicagoCheesePizza cheese");
    }

    @Override
    public void cut(){
        System.out.println("cut it into ChicagoCheesePizza slices");
    }
}
