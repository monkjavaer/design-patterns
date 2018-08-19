package com.pattern.decorator;

/**
 * 浓缩咖啡
 * @author tangquanbin
 * @date 2018/08/19 10:54
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "浓缩咖啡Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
