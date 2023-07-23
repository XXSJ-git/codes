package com.haha.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.haha.project.Menu;

import java.util.List;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-12-13 16:43
 **/
public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(Long id);
}