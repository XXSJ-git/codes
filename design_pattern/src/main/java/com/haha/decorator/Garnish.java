package com.haha.decorator;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 装饰者类(抽象装饰者)
 * @ClassName Garnish.java
 * @createTime 2023年09月07日 21:25
 */
public abstract class Garnish extends FastFood{
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood,float price,String desc){
        super(price, desc);
        this.fastFood = fastFood;
    }
}
