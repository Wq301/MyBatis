package com.wq.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-07-02 20:23
 */
public class SqlSeesionUtil {
    public SqlSession getSqlSession() {
        SqlSession ss=null;
        try {
            InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sfd = new SqlSessionFactoryBuilder();
            SqlSessionFactory sf = sfd.build(is);
            ss = sf.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ss;
    }
}