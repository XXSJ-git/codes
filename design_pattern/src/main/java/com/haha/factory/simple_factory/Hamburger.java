package com.haha.factory.simple_factory;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 汉堡包
 * @ClassName Hamburger.java
 * @createTime 2023年07月30日 17:16
 */
public class Hamburger implements Food{
    @Override
    public void ect() {
        System.out.println("吃汉堡包！");
    }
}
