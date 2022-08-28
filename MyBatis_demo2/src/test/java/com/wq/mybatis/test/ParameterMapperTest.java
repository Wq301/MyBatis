package com.wq.mybatis.test;

import com.wq.mybatis.mapper.ParameterMapper;
import com.wq.mybatis.pojo.User;
import com.wq.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/*
 * @author Wangqian
 * @create 2022-05-16 11:42
 */
public class ParameterMapperTest {
    @Test
    public void testGetAllUser() {
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

        List<User> users=mapper.getAllUser();
        users.forEach(user -> System.out.println(user));
    }
}
