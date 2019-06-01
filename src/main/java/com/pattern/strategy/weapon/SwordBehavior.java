package com.pattern.strategy.weapon;

/**
 * 宝剑
 * @author monkjavaer
 * @date 2018/08/18 11:35
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use Sword");
    }
}
