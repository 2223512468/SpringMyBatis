package com.jajahome.dao;

import com.jajahome.po.User;


/**
 * <p>Title: UserDao</p>
 * <p>Description: 用户dao</p>
 * <p>Company: www.itcast.com</p>
 *
 * @version 1.0
 * @author 传智.燕青
 * @date 2015-3-17下午2:47:51
 */
public interface UserDao {

    //根据id查询用户信息
    User findUserById(int id) throws Exception;

}
