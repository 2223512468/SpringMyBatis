package com.jajahome.dao;

import com.jajahome.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User findUserById(int id) throws Exception {

        // 创建SqlSession
        SqlSession sqlSession = this.getSqlSession();

        // 根据id查询用户信息
        User user = sqlSession.selectOne("test.findUserById", id);

        return user;

    }


}
