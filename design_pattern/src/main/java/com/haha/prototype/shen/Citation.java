package com.haha.prototype.shen;

import java.io.Serializable;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * @ClassName Citation.java
 * @createTime 2023年08月04日 23:15
 */
public class Citation implements Cloneable, Serializable {
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void show(){
        System.out.println(stu.getName()+"同学，由于成绩优秀特发此状！");
    }
    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
