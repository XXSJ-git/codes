package com.haha.factory.abstract_factory;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 可口可乐实物
 * @ClassName IcePeak.java
 * @createTime 2023年08月02日 22:53
 */
public class Cola implements Drink {

    @Override
    public void drink() {
        System.out.println("喝可口可乐！");
    }
}
