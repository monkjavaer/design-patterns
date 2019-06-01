package com.pattern.strategy.character;

import com.pattern.strategy.weapon.KnifeBehavior;

/**
 * @author monkjavaer
 * @date 2018/08/18 11:32
 */
public class Queen extends BaseCharacter {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.print("Queen fight:");
        weaponBehavior.useWeapon();
    }
}
