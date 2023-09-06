package com.lixinwei.springboot3demo.controller;

import com.lixinwei.springboot3demo.mapper.UserMapper;
import com.lixinwei.springboot3demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lixinwei
 * @date 2023/9/6 10:59
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("list")
    public List<User> list(){
        return userMapper.listUsers();
    }
}
