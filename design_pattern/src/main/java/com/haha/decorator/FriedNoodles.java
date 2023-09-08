package com.haha.decorator;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 炒面(具体构建者)
 * @ClassName FriedNoodles.java
 * @createTime 2023年09月07日 21:24
 */
public class FriedNoodles extends FastFood{
    public FriedNoodles() {
        super(8, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
