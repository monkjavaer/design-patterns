package com.pattern.decorator;

/**
 * 调料，抽象装饰者
 * @author monkjavaer
 * @date 2018/08/19 10:52
 */
public abstract class CondimentDecorator extends Beverage{

    @Override
    public abstract  String getDescription();
}
