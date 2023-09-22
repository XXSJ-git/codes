package com.haha.bridging;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: avi视频文件(具体的实现化角色)
 * @ClassName AviFile.java
 * @createTime 2023年09月21日 23:39
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件："+ fileName);
    }
}
