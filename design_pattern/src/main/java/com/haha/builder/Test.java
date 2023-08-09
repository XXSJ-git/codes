package com.haha.builder;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * @ClassName Test.java
 * @createTime 2023年08月09日 22:49
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director(new MobikeBuilder());
        Bike builder = director.builder();
        System.out.println(builder.getFrame());
    }
}
