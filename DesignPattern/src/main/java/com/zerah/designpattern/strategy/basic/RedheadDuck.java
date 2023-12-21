package com.zerah.designpattern.strategy.basic;

/**
 * 红头鸭
 */
public class RedheadDuck extends Duck{
    @Override
    void display() {
        System.out.println("外观是红头鸭");
    }
}
