package com.haha.builder;

import com.haha.builder.ceilling.LevelTwoCeiling;
import com.haha.builder.coat.DuluxCoat;
import com.haha.builder.coat.LiBangCoat;
import com.haha.builder.floor.ShengXiangFloor;
import com.haha.builder.tile.DongPengTile;
import com.haha.builder.tile.MarcoPoloTile;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 通过if else的方式来写
 * @ClassName DecorationPackage.java
 * @createTime 2023年08月05日 20:43
 */
public class DecorationPackage {
    public String getMatterList(BigDecimal area, Integer level) {
        List<Matter> list = new ArrayList<Matter>(); // 装修清单
        BigDecimal price = BigDecimal.ZERO; // 装修价格
        //豪华欧式
        if (1 == level){
            //吊顶 二级顶
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();
            //涂料 多乐士
            DuluxCoat duluxCoat = new DuluxCoat();
            //地板 圣象
            ShengXiangFloor shengXiangFloor = new ShengXiangFloor();
            list.add(levelTwoCeiling);
            list.add(duluxCoat);
            list.add(shengXiangFloor);
            price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price.add(area.multiply(new BigDecimal("1.4")).multiply(duluxCoat.price()));
            price = price.add(area.multiply(shengXiangFloor.price()));
        }
        //轻奢田园
        if (2 == level){
            //吊顶 二级顶
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();
            //涂料 立邦
            LiBangCoat liBangCoat = new LiBangCoat();
            //地板 马可波罗
            MarcoPoloTile marcoPoloTile = new MarcoPoloTile();
            list.add(levelTwoCeiling);
            list.add(liBangCoat);
            list.add(marcoPoloTile);
            price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price.add(area.multiply(new BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(marcoPoloTile.price()));


        }
        //现代简约
        if (3 == level){
            //吊顶 二级顶
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();
            //涂料 立邦
            LiBangCoat liBangCoat = new LiBangCoat();
            //地板 东鹏
            DongPengTile dongPengTile = new DongPengTile();
            list.add(levelTwoCeiling);
            list.add(liBangCoat);
            list.add(dongPengTile);
            price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price.add(area.multiply(new BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(dongPengTile.price()));
        }
        StringBuilder detail = new StringBuilder("\r\n--------------------"
                +"-----------------------------------\r\n" +
                "装修清单" + "\r\n" +
                        "套餐等级：" + level + "\r\n" +
                        "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) +
                        " 元\r\n" +
                        "房屋⾯面积：" + area.doubleValue() + " 平⽶米\r\n" +
                        "材料料清单：\r\n");
        for (Matter matter: list) {
            detail.append(matter.scene()).append("：").append(matter.brand()).append(
                    "、").append(matter.model()).append("、平⽶米价格：").append(matter.price()).append(" 元。\n");
        }
        return detail.toString();
    }
}
