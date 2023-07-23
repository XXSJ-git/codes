package com.haha.service;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-12-13 02:59
 **/
public interface UserDetailsService {

    UserDetails loadUserByUsername(String username);
}
