package com.haha;

import com.haha.mapper.UserMapper;
import com.haha.project.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @program: codes
 * @description:
 * @author: xxsj
 * @date: 2022-12-13 01:32
 **/
@Slf4j
@SpringBootTest
public class MapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserMapper(){
        User user = userMapper.selectById(1L);
        System.out.println(user);
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}
