package com.haha.adapter.object_adapter;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 适配者实现类
 * @ClassName TFCardImpl.java
 * @createTime 2023年08月31日 23:48
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "读到了tf卡里的数据";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("写入tf里的数据是："+msg);
    }
}
