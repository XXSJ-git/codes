package com.haha.proxy.static_proxy;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * @ClassName Client.java
 * @createTime 2023年08月10日 22:38
 */
public class Client {
    public static void main(String[] args) {
        Intermediary intermediary = new Intermediary();
        intermediary.rentHouse();
    }
}
