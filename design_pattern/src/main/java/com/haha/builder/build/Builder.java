package com.haha.builder.build;

import com.haha.builder.ceilling.LevelOneCeiling;
import com.haha.builder.ceilling.LevelTwoCeiling;
import com.haha.builder.coat.DuluxCoat;
import com.haha.builder.coat.LiBangCoat;
import com.haha.builder.floor.ShengXiangFloor;
import com.haha.builder.tile.DongPengTile;
import com.haha.builder.tile.MarcoPoloTile;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * @ClassName Builder.java
 * @createTime 2023年08月05日 21:48
 */
public class Builder {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }
    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢⽥田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，⼆级顶
                .appendCoat(new LiBangCoat())           // 涂料，⽴邦
                .appendTile(new MarcoPoloTile());       // 地砖，⻢可波罗
    }
    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，⼆级顶
                .appendCoat(new LiBangCoat())           // 涂料，⽴邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }
}
