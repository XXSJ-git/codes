package com.haha.builder.coat;

import com.haha.builder.Matter;

import java.math.BigDecimal;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:  立邦涂料
 * @ClassName LiBangCoat.java
 * @createTime 2023年08月05日 20:32
 */
public class LiBangCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "立邦";
    }

    @Override
    public String model() {
        return "默认级别";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(650);
    }

    @Override
    public String desc() {
        return "⽴邦始终以开发绿⾊产品、注⾼科技、⾼品质为目标，以技术力量不断推进科研和开发，满足消费者需求";
    }
}
