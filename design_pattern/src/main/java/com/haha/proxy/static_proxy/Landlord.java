package com.haha.proxy.static_proxy;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 房东租房
 * @ClassName Landlord.java
 * @createTime 2023年08月10日 22:35
 */
public class Landlord implements RentHouse {
    @Override
    public void rentHouse() {
        System.out.println("租房子");
    }
}
