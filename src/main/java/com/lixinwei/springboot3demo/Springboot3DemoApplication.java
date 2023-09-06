package com.lixinwei.springboot3demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.lixinwei.springboot3demo.mapper")
public class Springboot3DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3DemoApplication.class, args);
    }

}
