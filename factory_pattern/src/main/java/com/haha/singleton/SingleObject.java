package com.haha.singleton;

public class SingleObject {

    private static SingleObject instance = new SingleObject();
    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}
    //获取唯一可用的对象
    public static SingleObject gitInstance(){
        return instance;
    }

    public void ShowMessage(){
        System.out.println("Hello World!");
    }
}
