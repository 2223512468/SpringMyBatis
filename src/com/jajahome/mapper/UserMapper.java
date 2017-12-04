package com.jajahome.mapper;

import com.jajahome.po.User;

public interface UserMapper {

    //根据用户id查询用户信息
    User findUserById(int id) throws Exception;
}
