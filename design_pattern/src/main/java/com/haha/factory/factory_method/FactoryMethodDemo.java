package com.haha.factory.factory_method;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 工厂方法测试
 * @ClassName Test.java
 * @createTime 2023年07月30日 17:21
 */
public class FactoryMethodDemo {
    /**
     * 这里几个角色为：
         * 抽象产品（Abstract Product）：定义了产品的共同接口或抽象类。它可以是具体产品类的父类或接口，规定了产品对象的共同方法。
         * 具体产品（Concrete Product）：实现了抽象产品接口，定义了具体产品的特定行为和属性。
         * 抽象工厂（Abstract Factory）：声明了创建产品的抽象方法，可以是接口或抽象类。它可以有多个方法用于创建不同类型的产品。
         * 具体工厂（Concrete Factory）：实现了抽象工厂接口，负责实际创建具体产品的对象。
     * 就是具体工厂实现抽象工厂，具体产品实现抽象产品，有几个餐品就需要创建几个具体产品及具体工厂。
     * 工厂方法的优缺点
     *      优点：
     *          1、依然具有简单工厂的优点，服务器端修改类名之后，客户端无感。
     *          2、当客户端需要添加新的产品时，不需要修改作者原来的代码，只需要添加新的具体类和新的工厂即可。
     *      缺点：
     *          和简单工厂一样，当产品过多时，代码会显得十分臃肿。
     *      问题：
     *          1、但是客户端依然依赖于具体的工厂的类名，如果作者修改了工厂类的名字，那么客户端依然需要进行修改。
     *          解释：
     *              工厂的名字被视为接口，作者有义务保证工厂名的稳定，虽然客户端依赖于工厂的具体类名。在行业内所有的工厂名
     *              都时趋于稳定的(非100%)，至少工厂类的名字要比具体产品类的名字更稳定。
     *          2、即然我们要加新的东西就需要加新的具体类和工厂，为什么我们不自己写一个
     *          解释：
     *              作者在开发功能时不仅仅开发了抽象产品、具体产品、工厂。还有会搭配一些提前做好的框架，这样我们在添加完成之后也可以
     *              使用作者提前写好的一些东西。
     * @param args
     */
    public static void main(String[] args) {
        FoodFactory factory = new HamburgerFactory();
        Food food = factory.getFood();
        food.ect();

    }
}