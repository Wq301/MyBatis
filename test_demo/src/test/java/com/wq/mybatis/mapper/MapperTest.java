package com.wq.mybatis.mapper;

import com.wq.mybatis.pojo.Grade;
import com.wq.mybatis.pojo.Student;
import com.wq.mybatis.utils.SqlSeesionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-07-02 20:27
 */
public class MapperTest {
    @Test
    public void StuTest(){
        SqlSeesionUtil ss=new SqlSeesionUtil();
        SqlSession sqlSession = ss.getSqlSession();
        StudentMapper stu = sqlSession.getMapper(StudentMapper.class);

        List<Student> allStu = stu.getAllStu();
        for(Student student:allStu){
            System.out.println(student);
        }

//        Student student=new Student(null, "bbb", 12, 3);
//        Integer rows = stu.insertStu(student);
//        System.out.println("rows = " + rows);

//        Integer rows = stu.updataStuById(7);
//        System.out.println("rows = " + rows);


//        Integer rows = stu.deleteStuByName("abc");
//        System.out.println("rows = " + rows);
    }

    @Test
    public void GardeTest(){
        SqlSeesionUtil ss=new SqlSeesionUtil();
        SqlSession sqlSession = ss.getSqlSession();
        GardeMapper garde = sqlSession.getMapper(GardeMapper.class);

        List<Grade> allGrade = garde.getAllGrade();
        for(Grade grade:allGrade){
            System.out.println(grade);
        }
    }

    @Test
    public void TestStuandGrade(){
        SqlSeesionUtil ss=new SqlSeesionUtil();
        SqlSession sqlSession = ss.getSqlSession();
        StudentMapper student = sqlSession.getMapper(StudentMapper.class);

        List<Student> stus = student.getStuandGarde();
        for(Student stu:stus){
            System.out.println(stu);
        }
    }
    @Test
    public void TestGradeandStu(){
        SqlSeesionUtil ss=new SqlSeesionUtil();
        SqlSession sqlSession = ss.getSqlSession();
        GardeMapper grade = sqlSession.getMapper(GardeMapper.class);

        List<Grade> stus = grade.getGradeById(2);
        for(Grade stu:stus){
            System.out.println(stu);
        }
    }

    @Test
    public void TestStuOfGarde(){
        SqlSeesionUtil ss=new SqlSeesionUtil();
        SqlSession sqlSession = ss.getSqlSession();

        StudentMapper student = sqlSession.getMapper(StudentMapper.class);
        Student stuandGar = student.getStuandGar(5);
        System.out.println(stuandGar);
    }
}