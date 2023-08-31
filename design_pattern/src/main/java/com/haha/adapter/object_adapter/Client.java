package com.haha.adapter.object_adapter;

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
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        //将sd卡的数据转为tf数据
        String s1 = computer.readSD(sdAdapterTF);
        System.out.println(s1);
    }
}
