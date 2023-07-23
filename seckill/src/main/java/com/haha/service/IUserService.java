package com.haha.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.haha.communal.RespBean;
import com.haha.pojo.User;
import com.haha.vo.LoginVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xxsj
 * @since 2023-02-01
 */
public interface IUserService extends IService<User> {

    RespBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);

    User getUserByCookil(HttpServletResponse response, HttpServletRequest request, String userTicket);
}
