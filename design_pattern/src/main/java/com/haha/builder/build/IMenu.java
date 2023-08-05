package com.haha.builder.build;

import com.haha.builder.Matter;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 包装接口实现
 * @ClassName IMenu.java
 * @createTime 2023年08月05日 21:32
 */
public interface IMenu {
    IMenu appendCeiling(Matter matter); // 吊顶
    IMenu appendCoat(Matter matter);    // 涂料料
    IMenu appendFloor(Matter matter);   // 地板
    IMenu appendTile(Matter matter);    // 地砖
    String getDetail();
}
