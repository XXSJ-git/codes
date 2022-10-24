package com.haha.controller.entity;

import lombok.Data;

import java.util.List;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-10-24 01:35
 **/
@Data
public class UserVO {
    List<String> ids;
    String age;
    String name;
}
