package com.haha.singleton;

/**
 * 懒汉，线程不安全
 * 只有第一次被调用时才做初始化
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
