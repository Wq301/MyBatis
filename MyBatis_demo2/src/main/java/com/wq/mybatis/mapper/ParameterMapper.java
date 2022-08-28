package com.wq.mybatis.mapper;

import com.wq.mybatis.pojo.User;

import java.util.List;

/*
 * @author Wangqian
 * @create 2022-05-16 11:31
 */
public interface ParameterMapper {
    //查询所有的员工信息
    List<User> getAllUser();
}
