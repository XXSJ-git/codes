package com.haha.builder.ceilling;

import com.haha.builder.Matter;

import java.math.BigDecimal;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:一级吊顶
 * @ClassName LevelOneCeiling.java
 * @createTime 2023年08月05日 20:27
 */
public class LevelOneCeiling implements Matter {
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
        return "一级";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    @Override
    public String desc() {
        return "造型只做第⼀级，只有一个层次的吊顶，一般离顶120-150mm";
    }
}
