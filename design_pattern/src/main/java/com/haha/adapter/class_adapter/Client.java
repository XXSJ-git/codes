package com.haha.adapter.class_adapter;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * @ClassName Client.java
 * @createTime 2023年09月01日 00:01
 */
public class Client {
    public static void main(String[] args) {
        //创建计算机类
        Computer computer = new Computer();
        //读sd卡中的数据
        String s = computer.readSD(new SDCardImpl());
        System.out.println(s);
        //===============================
        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        //将sd卡的数据转为tf数据
        String s1 = computer.readSD(new SDAdapterTF());
        System.out.println(s1);
    }
}
