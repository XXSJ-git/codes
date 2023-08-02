package com.haha.factory.abstract_factory;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 汉堡包实物
 * @ClassName HamburFood.java
 * @createTime 2023年08月02日 22:59
 */
public class Hamburger implements Food{
    @Override
    public void eat() {
        System.out.println("吃汉堡包！");
    }
}
