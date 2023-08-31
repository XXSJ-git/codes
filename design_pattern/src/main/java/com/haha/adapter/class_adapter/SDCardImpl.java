package com.haha.adapter.class_adapter;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 适配者实现类
 * @ClassName SDCardImpl.java
 * @createTime 2023年08月31日 23:48
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "读到了sd卡里的数据";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("写入sd里的数据是："+msg);
    }
}
