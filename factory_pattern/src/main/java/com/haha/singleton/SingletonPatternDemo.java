package com.haha.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //获取唯一可用的对象
        SingleObject singleObject = SingleObject.gitInstance();
        singleObject.ShowMessage();
    }
}
