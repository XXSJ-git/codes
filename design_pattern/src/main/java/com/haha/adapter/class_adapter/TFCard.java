package com.haha.adapter.class_adapter;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 适配者接口
 * @ClassName TFCard.java
 * @createTime 2023年08月31日 23:44
 */
public interface TFCard {
    //读TC卡里的数据
    String readTF();

    //写TC卡里的数据
    void writeTF(String msg);
}
