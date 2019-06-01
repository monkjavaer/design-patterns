package com.pattern.decorator;

/**
 * 奶油
 * @author monkjavaer
 * @date 2018/08/19 11:06
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"加奶油Whip";
    }

    @Override
    public double cost() {
        return 0.4+beverage.cost();
    }
}
