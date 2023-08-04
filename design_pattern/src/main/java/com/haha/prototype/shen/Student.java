package com.haha.prototype.shen;

import java.io.Serializable;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * @ClassName Student.java
 * @createTime 2023年08月04日 23:16
 */
public class Student implements Serializable {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
