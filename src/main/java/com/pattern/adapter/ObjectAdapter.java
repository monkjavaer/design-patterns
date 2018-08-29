package com.pattern.adapter;

/**
 * 耳机3.5mm接口转换为Type-C接口的适配器
 *
 * 对象适配器模式：通过组合来实现适配器
 * @author tangquanbin
 * @date 2018/08/29 22:14
 */
public class ObjectAdapter implements Is35mmEarPhone{

    TypeC typeC;

    public ObjectAdapter(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void is35mmEarPhone() {
        typeC.isTypeC();
    }
}
