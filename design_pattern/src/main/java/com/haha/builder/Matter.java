package com.haha.builder;

import java.math.BigDecimal;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 物料
 *   物料接口提供了了基本的信息，以保证所有的装修材料都可以按照统⼀标准进行获取。
 * @ClassName Matter.java
 * @createTime 2023年08月05日 20:25
 */
public interface Matter {
    String scene();      // 场景；地板、地砖、涂料料、吊顶
    String brand();      // 品牌
    String model(); // 型号
    BigDecimal price(); // 价格
    String desc(); // 描述
}
