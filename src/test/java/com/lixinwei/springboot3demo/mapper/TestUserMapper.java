package com.lixinwei.springboot3demo.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lixinwei
 * @date 2023/9/6 12:59
 */
@SpringBootTest
public class TestUserMapper {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testList(){
        System.out.println(userMapper.listUsers());
    }

    @Test
    void testGetOne(){
        String id = "2";
        System.out.println(userMapper.getById(id));
    }
}
