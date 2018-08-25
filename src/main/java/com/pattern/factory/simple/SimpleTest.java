package com.pattern.factory.simple;

/**
 * @author tangquanbin
 * @date 2018/08/25 11:36
 */
public class SimpleTest {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);
        pizzaStore.orderPizza("clam");
    }
}
