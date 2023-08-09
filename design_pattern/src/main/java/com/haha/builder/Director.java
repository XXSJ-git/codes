package com.haha.builder;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 指挥者
 * @ClassName Director.java
 * @createTime 2023年08月09日 22:46
 */
public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike builder(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
