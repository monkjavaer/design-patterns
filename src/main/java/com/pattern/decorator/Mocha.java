package com.pattern.decorator;

/**
 * 摩卡
 * @author monkjavaer
 * @date 2018/08/19 11:01
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"加摩卡Mocha";
    }

    @Override
    public double cost() {
        return 0.3+beverage.cost();
    }
}
