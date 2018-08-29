package com.pattern.adapter;

/**
 * 通过适配器将3.5mm接口转换为type-c接口
 * @author tangquanbin
 * @date 2018/08/29 22:19
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {
        Is35mmEarPhone is35mmEarPhone = new ObjectAdapter(new PhoneTpyeC());
        is35mmEarPhone.is35mmEarPhone();
    }
}
