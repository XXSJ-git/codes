package com.haha.decorator;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 炒饭(具体构建者)
 * @ClassName FriedRice.java
 * @createTime 2023年09月07日 21:22
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
