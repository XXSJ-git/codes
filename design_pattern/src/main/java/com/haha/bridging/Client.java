package com.haha.bridging;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 当前例子： 不同的播放器有不同的播放文件。这是两个不同的纬度。我们可以根据桥接模式来对类似的需求进行改造
 * @ClassName Client.java
 * @createTime 2023年09月21日 23:47
 */
public class Client {
    public static void main(String[] args) {
        OperatingSystem mac = new Mac(new RmvFile());
        mac.play("绿皮书");
    }
}
