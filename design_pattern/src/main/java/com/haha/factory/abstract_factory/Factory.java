package com.haha.factory.abstract_factory;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 饮料抽象工厂
 * @ClassName DrinkFactory.java
 * @createTime 2023年08月02日 23:04
 */
public interface Factory {

    Drink getDrink();

    Food getFood();
}
