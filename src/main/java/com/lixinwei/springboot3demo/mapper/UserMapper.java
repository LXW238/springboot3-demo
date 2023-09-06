package com.lixinwei.springboot3demo.mapper;

import com.lixinwei.springboot3demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lixinwei
 * @date 2023/9/6 12:29
 */
@Mapper
public interface UserMapper {

//    @Select("select * from tb_user")
    List<User> listUsers();

    User getById(String id);
}
