package com.haha.factory.factory_method;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 汉堡包
 * @ClassName Hamburger.java
 * @createTime 2023年07月30日 17:16
 */
public class HamburgerFactory implements FoodFactory {

    @Override
    public Food getFood() {
        return new Hamburger();
    }
}
