package com.zerah.designpattern.strategy.basic;

/**
 * 绿头鸭
 */
public class MallardDuck  extends Duck{
    @Override
    void display() {
        System.out.println("外观是绿头");
    }
}
