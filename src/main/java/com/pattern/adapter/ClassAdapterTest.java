package com.pattern.adapter;

/**
 * 通过适配器将3.5mm接口转换为type-c接口
 * @author monkjavaer
 * @date 2018/08/29 22:11
 */
public class ClassAdapterTest {

    public static void main(String[] args) {

        Is35mmEarPhone is35mmEarPhone = new ClassAdapter();
        is35mmEarPhone.is35mmEarPhone();

    }

}
