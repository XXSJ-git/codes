package com.haha.config;

import com.alibaba.fastjson.JSON;
import com.haha.utils.ResponseResult;
import com.haha.utils.WebUtils;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: codes
 * @description: 如果是认证过程中出现的异常会被封装成AuthenticationException然后调用AuthenticationEntryPoint对象的方法去进行异常处理。
 * @author: xxsj
 * @date: 2022-12-13 18:51
 **/
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        ResponseResult result = new ResponseResult(HttpStatus.UNAUTHORIZED.value(), "认证失败请重新登录");
        String json = JSON.toJSONString(result);
        WebUtils.renderString(response,json);
    }
}