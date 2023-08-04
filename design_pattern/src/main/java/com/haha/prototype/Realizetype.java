package com.haha.prototype;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * @ClassName Realizetype.java
 * @createTime 2023年08月04日 22:52
 */
public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("原型对象创建完成！");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}

