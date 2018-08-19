package com.pattern.decorator;

/**
 * 饮料
 * @author tangquanbin
 * @date 2018/08/18 22:02
 */
public abstract class Beverage {
    String description = "=====";
    public String getDescription(){
        return description;
    }
    public abstract  double cost();
}
