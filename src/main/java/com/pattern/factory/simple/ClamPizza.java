package com.pattern.factory.simple;

import com.pattern.factory.Pizza;

/**
 * @author tangquanbin
 * @date 2018/08/25 11:30
 */
public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "ClamPizza";
        dough = "Thin crust dough ClamPizza";
        sauce = "Marina sauce ClamPizza";
        toppings.add("Grated ClamPizza cheese");
    }

    @Override
    public void cut() {
        System.out.println("cut it into ClamPizza slices");
    }
}
