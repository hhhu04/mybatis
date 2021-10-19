package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user(user_id,password) values(#{user.user_id},#{user.password})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public int insertBoard(@Param("user") User user);

}
