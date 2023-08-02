package com.haha.factory.simple_factory;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 简单工厂测试
 * @ClassName Test.java
 * @createTime 2023年07月30日 17:21
 */
public class SimpleFactoryDemo {
    /**
     * 简单工厂的优缺点
     *      优点：
     *          1、具体产品类型从客户端中剥离出来，解耦
     *          2、服务端修改具体产品名，客户端不知道
     *      缺点：
     *          1、客户端需要记住常量和具体的产品之前的对应关系
     *          2、如果产品特别多，会变的十分臃肿
     * @param args
     */
    public static void main(String[] args) {
        Food food = FoodFactory.getFood(1);
        food.ect();

    }
}
