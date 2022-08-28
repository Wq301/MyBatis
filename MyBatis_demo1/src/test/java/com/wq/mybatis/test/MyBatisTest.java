package com.wq.mybatis.test;

import com.wq.mybatis.mapper.UserMapper;
import com.wq.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*
 * @author Wangqian
 * @create 2022-05-14 15:46
 */
public class MyBatisTest {
    @Test
    public void testInsert() throws IOException {

        //使用字节输入流，加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取SqlSession,代表Java程序和数据库之间的会话。
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper接口对象,返回mapper接口的实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //测试功能
        int result = mapper.insertUser();
//        //提交事务
//        sqlSession.commit();
        System.out.println("result=" + result);
    }
    @Test
    public void testUpdate() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
    }
    @Test
    public void testDelete() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试删除
//        mapper.deleteUser();

        //测试查询一条数据
//        User user=mapper.getUserById();
//        System.out.println(user);

//        //测试查询所有数据
        List<User> list = mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
    }
    
}

