package com.haha.factory.simple_factory;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 工厂
 * @ClassName FoodFactory.java
 * @createTime 2023年07月30日 17:19
 */
public class FoodFactory {
    public static Food getFood(int i){
        Food food = null;
        switch (i){
            case 1:
                food = new Hamburger();
                break;
            case 2:
                food = new RiceNoodles();
                break;
        }
        return food;
    }
}
