package com.haha.builder;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 具体建造者
 * @ClassName MobikeBuilder.java
 * @createTime 2023年08月09日 22:41
 */
public class MobikeBuilder implements Builder{
    Bike bike = new Bike();
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
