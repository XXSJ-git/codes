package com.haha.decorator;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * @ClassName Client.java
 * @createTime 2023年09月07日 21:34
 */
public class Client {
    public static void main(String[] args) {
        FastFood fastFood = new FriedRice();
        System.out.println(fastFood.getDesc()+": "+fastFood.cost());

        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc()+": "+fastFood.cost());

        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc()+": "+fastFood.cost());
    }
}
