package com.haha.factory.factory_method;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 米线
 * @ClassName riceNoodles.java
 * @createTime 2023年07月30日 17:17
 */
public class RiceNoodlesFactory implements FoodFactory {
    @Override
    public Food getFood() {
        return new RiceNoodles();
    }
}
