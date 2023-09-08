package com.haha.decorator;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 快餐类(抽象构建者)
 * @ClassName FastFood.java
 * @createTime 2023年09月07日 21:16
 */
public abstract class FastFood {
    private float price;   //价格
    private String desc;    //描述

    //计算总价的方法
    public abstract float cost();

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }
    public FastFood() {
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }



}
