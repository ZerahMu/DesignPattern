package com.zerah.designpattern.strategy.basic;

/**
 * 假鸭子
 */
public class DecoyDuck extends Duck{

    @Override
    void display() {
        System.out.println("我是假的鸭子");
    }

    @Override
    void quack() {
        System.out.println("假鸭子不会叫");
    }

    @Override
    void fly() {
        System.out.println("假鸭子也不会飞");
    }
}
