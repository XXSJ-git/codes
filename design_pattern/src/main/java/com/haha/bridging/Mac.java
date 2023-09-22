package com.haha.bridging;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 具体操作系统类(扩展抽象化角色)
 * @ClassName Windows.java
 * @createTime 2023年09月21日 23:43
 */
public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
