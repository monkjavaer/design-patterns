package com.pattern.factory;

import java.util.ArrayList;

/**
 * 披萨类
 * @author tangquanbin
 * @date 2018/08/25 11:03
 */
public abstract class Pizza {

    /**
     * 名称
     */
    public String name;
    /**
     * 面团类型
     */
    public String dough;
    /**
     * 酱料类型
     */
    public String sauce;
    /**
     * 一套佐料
     */
    public ArrayList toppings = new ArrayList();

    public void prepare() {

        System.out.println("Preparing " + name);
        System.out.println("Tossing dough..." + dough);
        System.out.println("Adding sauce..." + sauce);
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));

        }

    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}
