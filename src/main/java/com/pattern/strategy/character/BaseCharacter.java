package com.pattern.strategy.character;

import com.pattern.strategy.weapon.WeaponBehavior;

/**
 * 角色抽象类
 * @author tangquanbin
 * @date 2018/08/18 10:35
 */
public abstract class BaseCharacter {

    WeaponBehavior weaponBehavior;

    public BaseCharacter(){

    }

    /**
     * 切换武器
     * @param weaponBehavior
     */
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        System.out.println("set weapon");
        this.weaponBehavior = weaponBehavior;
    }

    /**
     * 用不同武器战斗
     */
    public abstract void fight();

    /**
     * 所有继承这个抽象类的都可以说hello
     */
    public void sayHello(){
        System.out.print("hello!");
    }
}
