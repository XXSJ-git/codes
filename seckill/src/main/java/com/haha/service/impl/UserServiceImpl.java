package com.haha.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haha.communal.RespBean;
import com.haha.communal.RespBeanEnum;
import com.haha.exception.GlobalException;
import com.haha.mapper.UserMapper;
import com.haha.pojo.User;
import com.haha.service.IUserService;
import com.haha.utils.CookieUtil;
import com.haha.utils.MD5Utils;
import com.haha.utils.UUIDUtil;
import com.haha.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xxsj
 * @since 2023-02-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public RespBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response) {
        String mobile = loginVo.getMobile();
        String formPass = loginVo.getPassword();

        User user = baseMapper.selectById(mobile);
        if(user == null) {
            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
        }
        if(!MD5Utils.formPassToDBPass(formPass, user.getSalt()).equals(user.getPasword())) {
            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
        }
        //生成Cookie
        String ticket = UUIDUtil.uuid();
        //将用户信息放入redis
        redisTemplate.opsForValue().set("user:"+ticket,user);
        //request.getSession().setAttribute(ticket, user);
        CookieUtil.setCookie(request, response, "userTicket", ticket);
        return RespBean.success(ticket);
    }

    @Override
    public User getUserByCookil(HttpServletResponse response, HttpServletRequest request, String userTicket) {

        if (StringUtils.isEmpty(userTicket)) {
            return null;
        }
        User user = (User) redisTemplate.opsForValue().get("user:" + userTicket);
        if (null != user) {
            CookieUtil.setCookie(request,response,"userTicket",userTicket);
        }

        return user;
    }
}
