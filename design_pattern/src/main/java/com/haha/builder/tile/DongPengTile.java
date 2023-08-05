package com.haha.builder.tile;

import com.haha.builder.Matter;

import java.math.BigDecimal;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:东鹏地砖
 * @ClassName DongPengTile.java
 * @createTime 2023年08月05日 20:37
 */
public class DongPengTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "东鹏地砖";
    }

    @Override
    public String model() {
        return "10001";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(102);
    }

    @Override
    public String desc() {
        return "东鹏瓷砖以品质铸就品牌，科技推动品牌，⼝碑传播品牌为宗旨，2014年品牌价值132.35亿元，位列建陶行业榜首。";
    }
}
