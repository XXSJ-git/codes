package com.haha.builder;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 具体建造者
 * @ClassName OfoBuilder.java
 * @createTime 2023年08月09日 22:44
 */
public class OfoBuilder implements Builder{
    Bike bike = new Bike();

    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
