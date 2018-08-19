package com.pattern.decorator;

/**
 * 混合咖啡
 * @author tangquanbin
 * @date 2018/08/19 10:59
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "混合咖啡house blend";
    }

    @Override
    public double cost() {
        return 1.9;
    }
}
