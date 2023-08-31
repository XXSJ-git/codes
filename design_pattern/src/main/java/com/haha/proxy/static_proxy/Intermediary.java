package com.haha.proxy.static_proxy;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 中介租房
 * @ClassName intermediary.java
 * @createTime 2023年08月10日 22:36
 */
public class Intermediary implements RentHouse {
    private Landlord landlord = new Landlord();

    @Override
    public void rentHouse() {
        System.out.println("在房东价格的基础上增加一部分金额");
        landlord.rentHouse();
    }
}
