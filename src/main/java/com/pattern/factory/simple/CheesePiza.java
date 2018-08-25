package com.pattern.factory.simple;

import com.pattern.factory.Pizza;

/**
 * @author tangquanbin
 * @date 2018/08/25 11:27
 */
public class CheesePiza extends Pizza {

    public CheesePiza() {
        name = "CheesePiza";
        dough = "Thin crust dough CheesePiza";
        sauce = "Marina sauce CheesePiza";
        toppings.add("Grated CheesePiza cheese");
    }

    @Override
    public void cut(){
        System.out.println("cut it into CheesePiza slices");
    }

}
