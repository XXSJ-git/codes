package com.haha.proxy.jdk_proxy;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * @ClassName Client.java
 * @createTime 2023年08月11日 21:05
 */
public class Client {
    public static void main(String[] args) {
        // 创建代理对象
        // 1. 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 2. 使用factory对象的方法获取代理对象
        RentHouse proxyObject = factory.getProxyObject();
        // 3. 调用卖票的方法
        proxyObject.rentAHouse();
    }
}
