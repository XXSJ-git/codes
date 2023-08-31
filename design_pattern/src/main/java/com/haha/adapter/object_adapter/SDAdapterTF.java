package com.haha.adapter.object_adapter;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 适配器类
 * @ClassName SDAdapterTF.java
 * @createTime 2023年08月31日 23:57
 */
public class SDAdapterTF implements SDCard {
    //声明配置者
    private TFCard tfCard;

   public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }
    @Override
    public String readSD() {
        System.out.println("将sd的数据转换为tf读取！");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("将sd的数据写入到tf中");
        tfCard.writeTF(msg);
    }
}
