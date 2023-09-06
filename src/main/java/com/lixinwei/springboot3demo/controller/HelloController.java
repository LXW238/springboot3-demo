package com.lixinwei.springboot3demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lixinwei
 * @date 2023/9/6 14:12
 */
@RestController
public class HelloController {
    @GetMapping
    public String hello(HttpServletRequest request){
        String name = request.getParameter("name");
        return "hello,: " + name;
    }
}
