package com.pattern.adapter;

/**
 * 耳机3.5mm接口转换为Type-C接口的适配器
 *
 * 类适配器模式：通过多重继承来实现适配器功能。多重继承就是先继承要转换的实现类，再实现被转换的接口。
 * @author monkjavaer
 * @date 2018/08/29 21:47
 */
public class ClassAdapter extends PhoneTpyeC implements Is35mmEarPhone {


    @Override
    public void is35mmEarPhone() {
        isTypeC();
    }
}
