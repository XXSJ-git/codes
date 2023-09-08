package com.haha.decorator;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 培根类(具体装饰者)
 * @ClassName Egg.java
 * @createTime 2023年09月07日 21:30
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "鸡蛋");
    }

    @Override
    public float cost() {
        return getPrice()+getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
