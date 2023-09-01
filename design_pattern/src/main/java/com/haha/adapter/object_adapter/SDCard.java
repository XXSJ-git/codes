package com.haha.adapter.object_adapter;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 目标接口
 * @ClassName SDCard.java
 * @createTime 2023年08月31日 23:44
 */
public interface SDCard {
    //读TC卡里的数据
    String readSD();

    //写TC卡里的数据
    void writeSD(String msg);
}
