package com.pattern.strategy.character;

import com.pattern.strategy.weapon.KnifeBehavior;

/**
 * @author monkjavaer
 * @date 2018/08/18 11:30
 */
public class King extends BaseCharacter{

    public King() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight(){
        System.out.print("king fight:");
        weaponBehavior.useWeapon();
    }
}
