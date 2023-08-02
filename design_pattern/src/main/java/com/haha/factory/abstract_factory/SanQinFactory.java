package com.haha.factory.abstract_factory;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * @ClassName HamburgerFactory.java
 * @createTime 2023年08月02日 23:13
 */
public class SanQinFactory implements Factory{
    @Override
    public Drink getDrink() {
        return new IcePeak();
    }

    @Override
    public Food getFood() {
        return new RiceNoodle();
    }
}
