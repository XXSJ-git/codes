package com.haha.builder.coat;

import com.haha.builder.Matter;

import java.math.BigDecimal;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 多乐士涂料
 * @ClassName DuluxCoat.java
 * @createTime 2023年08月05日 20:31
 */
public class DuluxCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "多乐⼠(Dulux)";
    }

    @Override
    public String model() {
        return "第二代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(719);
    }

    @Override
    public String desc() {
        return "多乐⼠是阿克苏诺⻉尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国家，每年全球有5000万户家庭使⽤多乐士油漆。";
    }
}
