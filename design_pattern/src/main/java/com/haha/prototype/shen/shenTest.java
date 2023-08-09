package com.haha.prototype.shen;

import java.io.*;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 深克隆
 * @ClassName shenTest.java
 * @createTime 2023年08月04日 23:25
 */
public class shenTest {
    public static void main(String[] args) throws Exception{
        //创建原型对象
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStu(student);

        //创建对象输出量
        ObjectOutputStream oos
                = new ObjectOutputStream(new FileOutputStream("/Users/xxsj/Documents/lx/codes/design_pattern/src/main/resources/document/a.txt"));
        oos.writeObject(citation);
        //释放资源
        oos.close();

        //创建对象输入流
        ObjectInputStream ois
                = new ObjectInputStream(new FileInputStream("/Users/xxsj/Documents/lx/codes/design_pattern/src/main/resources/document/a.txt"));
        Citation citation1 = (Citation) ois.readObject();
        //释放资源
        ois.close();
        citation1.getStu().setName("李四");

        citation1.show();
        citation.show();


    }
}
