package com.haha.adapter.object_adapter;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 计算机
 * @ClassName Computer.java
 * @createTime 2023年08月31日 23:53
 */
public class Computer {
    //读取sd卡数据
    public String readSD(SDCard sdCard){
        if (null == sdCard){
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
