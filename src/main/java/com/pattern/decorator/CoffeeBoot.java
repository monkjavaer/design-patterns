package com.pattern.decorator;

/**
 * 买咖啡
 * @author monkjavaer
 * @date 2018/08/19 11:04
 */
public class CoffeeBoot {

    public static void main(String[] args) {
        //买一杯混合咖啡什么调料也不加
        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription() +"应付"+ houseBlend.cost()+"$");
        //买一杯浓缩咖啡加一份摩卡
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        System.out.println(espresso.getDescription() +"应付"+ espresso.cost()+"$");
        //再加一份奶油
        espresso = new Whip(espresso);
        System.out.println(espresso.getDescription() +"应付"+ espresso.cost()+"$");

    }

}
