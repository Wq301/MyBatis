package com.wq.mybatis.pojo;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-07-02 19:37
 */
public class Student {
    private Integer sid;
    private String stuName;
    private Integer stuAge;
    private Integer cid;
    private Grade grade;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", cid=" + cid +
                ", grade=" + grade +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Student(Integer sid, String stuName, Integer stuAge, Integer cid) {
        this.sid = sid;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.cid = cid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

}