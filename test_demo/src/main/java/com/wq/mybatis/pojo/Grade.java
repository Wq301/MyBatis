package com.wq.mybatis.pojo;

import java.util.List;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-07-02 20:02
 */
public class Grade {
    private Integer cid;
    private String className;
    private String classEmail;
    private List<Student> student;

    public Grade() {
    }

    public Grade(Integer cid, String className, String classEmail) {
        this.cid = cid;
        this.className = className;
        this.classEmail = classEmail;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassEmail() {
        return classEmail;
    }

    public void setClassEmail(String classEmail) {
        this.classEmail = classEmail;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "cid=" + cid +
                ", className='" + className + '\'' +
                ", classEmail='" + classEmail + '\'' +
                ", student=" + student +
                '}';
    }

}