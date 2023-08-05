package com.haha.builder.ceilling;

import com.haha.builder.Matter;

import java.math.BigDecimal;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:二级吊顶
 * @ClassName LevelTwoCeiling.java
 * @createTime 2023年08月05日 20:29
 */
public class LevelTwoCeiling implements Matter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "⼆级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(850);
    }

    @Override
    public String desc() {
        return "两个层次的吊顶，⼆级吊顶⾼度一般就往下吊20cm，要是层高很高，也可增加每级的厚度";
    }
}
