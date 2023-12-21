package com.zerah.designpattern.strategy.basic;

/**
 * 鸭子父类
 */
public abstract class Duck {
    /**
     * 呱呱叫
     */
    void quack(){
        System.out.println("呱呱");
    }

    /**
     * 游泳
     */
    void swim(){
        System.out.println("我会游泳");
    }

    /**
     * 外观
     * 每个鸭子不一样，所以行为由子类具体实现
     */
    abstract void display();

    void fly(){
        System.out.println("我还会飞");
    }
}
