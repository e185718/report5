package jp.ac.uryukyu.ie.e185718;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    void attack() {
        int hitpoint = 10;
        Hero hero = new Hero("勇者", hitpoint, 5);
        Enemy enemy = new Enemy("スライム", 0, 3);
        enemy.setDead(true);
        for(int i = 0;i<5 ;++i) {   //1度じゃないのは、攻撃結果が0ダメージとなる可能性があるため
            enemy.attack(hero);
        }
        assertEquals(hitpoint,hero.getHitPoint());



    }
}