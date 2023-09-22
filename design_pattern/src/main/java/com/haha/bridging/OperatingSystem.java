package com.haha.bridging;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:  抽象的操作系统类(抽象化角色)
 * @ClassName OperatingSystem.java
 * @createTime 2023年09月21日 23:41
 */
public abstract class OperatingSystem {
    // 声明VideoFile变量
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
