package com.haha.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: codes
 * @description: 自定义认证成功处理器
 * @author: xxsj
 * @date: 2022-12-13 19:11
 **/
@Component
public class SGSuccessHandler implements AuthenticationSuccessHandler {
    /**
     * 实际上在UsernamePasswordAuthenticationFilter进行登录认证的时候，
     * 如果登录成功了是会调用AuthenticationSuccessHandler的方法进行认证成功后的处理的。AuthenticationSuccessHandler就是登录成功处理器。
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        System.out.println("认证成功了");
    }

}
