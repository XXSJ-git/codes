package com.haha.prototype;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * @ClassName test.java
 * @createTime 2023年08月04日 23:08
 */
public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
        //判断地址是否相同
        System.out.println("地址是否相同"+(realizetype==clone));

    }
}
