package com.haha.service;

import com.haha.project.User;
import com.haha.utils.ResponseResult;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-12-13 03:16
 **/
public interface LoginServcie {

    ResponseResult login(User user);

    ResponseResult logout();
}
