# 一、策略模式
    定义了算法族，分别封装起来，让他们之间可以互相替换。此模式让算法的变化独立于使用算法的客户


## 1.简单的鸭子
鸭子抽象类
```java
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
}
```


绿头鸭,直接继承抽象类、因为颜色不一样，所以重写外观方法
```java
public class MallardDuck  extends Duck{
    @Override
    void display() {
        System.out.println("外观是绿头");
    }
}
```

红头鸭，也重写外观方法
```java
public class RedheadDuck extends Duck{
    @Override
    void display() {
        System.out.println("外观是红头鸭");
    }
}
```

现在需要鸭子会飞，于是在抽象类中增加鸭子**飞行**的方法，于是父类变成了
```java
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

```
但是，这样有个一个问题，有些鸭子不会飞，在父类中增加飞行的方法就不太合理了

```java
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
}
```

通过继承的方式，橡皮鸭重写父类的 fly方法可以实现橡皮鸭不会飞的目的，于是就成了

```java
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
```
貌似可以实现功能，但是如果又有一个诱饵鸭子，既不会飞也不会叫，那还要去重写父类方法就会变成
```java
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
```

如果又有别的类型的鸭子，还要继续重写方法，工作量就上来了