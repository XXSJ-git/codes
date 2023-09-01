package com.haha.adapter.class_adapter;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 适配器类
 * @ClassName SDAdapterTF.java
 * @createTime 2023年08月31日 23:57
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{

    @Override
    public String readSD() {
        System.out.println("将sd的数据转换为tf读取！");
        return readTF();//这里时调用TFCardImpl的方法
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("将sd的数据写入到tf中");
        writeTF(msg);
    }
}
