package com.haha.builder;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 抽象建造者
 * @ClassName Builder.java
 * @createTime 2023年08月09日 22:40
 */
public interface Builder {
    void buildFrame();
    void buildSeat();
    Bike createBike();
}
