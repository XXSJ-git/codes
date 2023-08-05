package com.haha.builder.tile;

import com.haha.builder.Matter;

import java.math.BigDecimal;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 马可波罗地砖
 * @ClassName MarcoPoloTile.java
 * @createTime 2023年08月05日 20:39
 */
public class MarcoPoloTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "⻢可波罗(MARCO POLO)";
    }

    @Override
    public String model() {
        return "缺省";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }

    @Override
    public String desc() {
        return "“⻢马可波罗”品牌诞⽣于1996年，作为国内最早品牌化的建陶品牌，以“⽂化陶瓷”占领市场，享有“仿古砖至尊”的美誉。";
    }
}
