package com.pattern.strategy;

import com.pattern.strategy.character.BaseCharacter;
import com.pattern.strategy.character.King;
import com.pattern.strategy.character.Queen;
import com.pattern.strategy.weapon.SwordBehavior;

/**
 * 策略模式：定义了算法簇，分别封装起来，让他们之间可以互相替换，让算法簇的变化独立于使用算法的客户。
 * test
 * @author monkjavaer
 * @date 2018/08/18 10:44
 */
public class Boot {
    public static void main(String[] args) {

        BaseCharacter king = new King();
        king.sayHello();
        king.fight();
        king.setWeaponBehavior(new SwordBehavior());
        king.fight();

        BaseCharacter queen = new Queen();
        queen.fight();
    }
}
