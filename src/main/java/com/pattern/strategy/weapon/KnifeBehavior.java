package com.pattern.strategy.weapon;

/**
 * 匕首
 * @author monkjavaer
 * @date 2018/08/18 11:36
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use Knife");
    }
}
