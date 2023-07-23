package com.haha.controller;

import com.haha.pojo.User;
import com.haha.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    IUserService userService;

    @RequestMapping("/toList")
    public String toList(HttpServletRequest request, HttpServletResponse response, Model model, @CookieValue("userTicket") String ticket){
        if (StringUtils.isEmpty(ticket)) {
            return "login";
        }
        //User user = (User) session.getAttribute(ticket);
        User user = userService.getUserByCookil(response, request, ticket);
        if (null==user) {
            return "login";
        }

        model.addAttribute("user",user);
        return "goodsList";
    }

}
