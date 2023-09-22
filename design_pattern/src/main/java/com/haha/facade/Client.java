package com.haha.facade;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * @ClassName Client.java
 * @createTime 2023年09月22日 00:11
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开电器");
        System.out.println("===========================");
        smartAppliancesFacade.say("关闭电器");
    }
}
