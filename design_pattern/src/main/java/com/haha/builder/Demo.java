package com.haha.builder;

import com.haha.builder.build.Builder;

import java.math.BigDecimal;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * @ClassName Demo.java
 * @createTime 2023年08月05日 21:29
 */
public class Demo {
    public static void main(String[] args) {
        DecorationPackage decoration = new DecorationPackage();
        // 豪华欧式
        System.out.println(decoration.getMatterList(new
                BigDecimal("132.52"),1));
        // 轻奢⽥田园
        System.out.println(decoration.getMatterList(new
                BigDecimal("98.25"),2));
        // 现代简约
        System.out.println(decoration.getMatterList(new
                BigDecimal("85.43"),3));
    //==================================================

        Builder builder = new Builder();
        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());
        // 轻奢⽥田园
        System.out.println(builder.levelTwo(98.25D).getDetail());
        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());

    }
}
