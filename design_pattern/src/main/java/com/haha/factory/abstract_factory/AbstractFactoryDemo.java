package com.haha.factory.abstract_factory;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * @ClassName AbstractFactoryDemo.java
 * @createTime 2023年08月02日 23:17
 */
public class AbstractFactoryDemo {
    /**
     * 抽象工厂和工厂一样，角色都分为：
     * 抽象工厂（Abstract Factory）：声明了一组用于创建产品对象的方法，每个方法对应一种产品类型。抽象工厂可以是接口或抽象类。
     * 具体工厂（Concrete Factory）：实现了抽象工厂接口，负责创建具体产品对象的实例。
     * 抽象产品（Abstract Product）：定义了一组产品对象的共同接口或抽象类，描述了产品对象的公共方法。
     * 具体产品（Concrete Product）：实现了抽象产品接口，定义了具体产品的特定行为和属性。
     *这里就是多个抽象工厂实现一个总抽象工厂
     *
     * 优点：
     *      1、仍然具备工厂方法的和简单工厂的优点
     *      2、抽象工厂把工厂类的数量减少了
     * 抽象工厂中可以产生多个产品，产品与产品之间必须有内在联系。
     * 同意个产品工厂中产品都属于同一个产品簇；
     * 例如：海尔工厂 生产空调、冰箱；格力工厂生产空调、冰箱(两个工厂都是；一个工厂两个实现类) 而不是格力工厂生产海尔冰箱
     *
     * 缺点：
     *      1、当增加产品簇时不需要修改代码，只需要新增即可。但当增加或修改产品等级时，原先所以代码都需要修改。违反了"开闭原则"
     */
    public static void main(String[] args) {
        taste(new KFCFactory());
    }
    public static void taste(Factory f){
        Food food1 = f.getFood();
        Drink drink1 = f.getDrink();
        food1.eat();
        drink1.drink();
        System.out.println("======客户1======");

        Food food2 = f.getFood();
        Drink drink2 = f.getDrink();
        food2.eat();
        drink2.drink();
        System.out.println("======客户2======");

        Food food3 = f.getFood();
        Drink drink3 = f.getDrink();
        food3.eat();
        drink3.drink();
        System.out.println("======客户3======");

    }

}
