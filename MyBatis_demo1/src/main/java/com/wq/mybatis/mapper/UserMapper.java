package com.wq.mybatis.mapper;

import com.wq.mybatis.pojo.User;

import java.util.List;

/*
 * @author Wangqian
 * @create 2022-05-14 11:49
 */
public interface UserMapper {
    //添加用户信息
    int insertUser();
    //修改用户信息
    void updateUser();
    //删除用户信息
    void deleteUser();

    //查询用户信息
    //(1)根据id查询用户信息
    User getUserById();
    //(2)查询所有的用户信息
    List<User> getAllUser();
}
