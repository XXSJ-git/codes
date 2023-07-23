package com.haha.singleton;

/**
 * 饿汉模式
 * 类加载的时候就做了初始化
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3(){}

    public static Singleton3 getInstance(){
        return instance;
    }
}
