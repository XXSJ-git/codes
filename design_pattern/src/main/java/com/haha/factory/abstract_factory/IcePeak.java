package com.haha.factory.abstract_factory;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 冰峰实物
 * @ClassName IcePeak.java
 * @createTime 2023年08月02日 22:53
 */
public class IcePeak implements Drink {

    @Override
    public void drink() {
        System.out.println("喝冰峰饮料！");
    }
}
