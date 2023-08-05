package com.haha.builder.build;

import com.haha.builder.Matter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 是Imenu接口的实现类，主要是承载建造过程中的填充器器。相当于这是一套承载物料和创建者中间衔接的内容。
 * @ClassName DecorationPackageMenu.java
 * @createTime 2023年08月05日 21:33
 */
public class DecorationPackageMenu implements IMenu {
    private List<Matter> list = new ArrayList<Matter>();  // 装修清单
    private BigDecimal price = BigDecimal.ZERO;      // 装修价格
    private BigDecimal area;  // ⾯面积
    private String grade;     // 装修等级；豪华欧式、轻奢⽥田园、现代简约

    private DecorationPackageMenu() {
    }

    public DecorationPackageMenu(Double area, String grade) {
        this.area = new BigDecimal(area);
        this.grade = grade;
    }

    @Override
    public IMenu appendCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendCoat(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("1.4")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendFloor(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendTile(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public String getDetail() {
        StringBuilder detail = new StringBuilder("\r\n--------------------" +
                "-----------------------------------\r\n" +
                "装修清单" + "\r\n" +
                "套餐等级：" + grade + "\r\n" +
                "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) +
                " 元\r\n" +
                "房屋⾯面积：" + area.doubleValue() + " 平⽶米\r\n" +
                "材料料清单：\r\n");
        for (Matter matter : list) {
            detail.append(matter.scene()).append("：")
                    .append(matter.brand())
                    .append("、")
                    .append(matter.model())
                    .append("、平米价格：")
                    .append(matter.price())
                    .append(" 元。\n");
        }
        return detail.toString();
    }
}

