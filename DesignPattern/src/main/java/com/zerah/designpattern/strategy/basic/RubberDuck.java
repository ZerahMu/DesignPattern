package com.zerah.designpattern.strategy.basic;

/**
 * 橡皮鸭
 */
public class RubberDuck extends Duck{
    @Override
    void display() {
        System.out.println("我是一个橡皮鸭");
    }

    @Override
    void quack() {
        System.out.println("橡皮鸭吱吱叫");
    }

    @Override
    void fly() {
        System.out.println("我是橡皮鸭 ，我不会飞");
    }
}
