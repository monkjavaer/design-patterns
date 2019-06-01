package com.pattern.strategy.character;

import com.pattern.strategy.weapon.SwordBehavior;

/**
 * @author monkjavaer
 * @date 2018/08/18 11:33
 */
public class Knight extends BaseCharacter {
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.print("Knight fight:");
        weaponBehavior.useWeapon();
    }
}
