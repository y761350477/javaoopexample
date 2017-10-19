package com.yc.sqlitejdbc.action;

import com.yc.sqlitejdbc.bean.Student;
import com.yc.sqlitejdbc.dao.StudentDao;
import com.yc.sqlitejdbc.impl.StudentImpl;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/7/18 0018.
 * SqLite的JDBC的整理:
 * 包括(增、删、改、查);
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        StudentDao studentDao = new StudentImpl();
        Student student = new Student();

        /*增加的方法*/
        /*student.setId(5);
        student.setName("杨晨");
        student.setSex("男");
        student.setAge(17);
        int insertResult = studentDao.insert(student);
        if (insertResult == 1) {
            System.out.println("添加成功!");
        } else {
            System.out.println("添加失败!");
        }*/

        /*删除的方法*/
        /*int deleteNum = studentDao.delete();
        System.out.println(deleteNum);  //  区别于MySql删除成功返回的是删除的数量*/
        /*student.setId(3);
        int deleteByBeanNum = studentDao.deleteByBean(student);
        if (deleteByBeanNum == 1) {
            System.out.println("删除成功!");
        } else {
            System.out.println("删除失败!");
        }*/

        /*更改的方法*/
        /*student.setId(1);
        student.setName("haha");
        int updateResult = studentDao.update(student);
        if (updateResult == 1) {
            System.out.println("修改成功!");
        } else {
            System.out.println("修改失败!");
        }*/

        /*查询的方法*/
        /*List<List<Object>> students = studentDao.findAll();
        for (List<Object> studentInfo:students) {
            System.out.print(studentInfo.get(0).toString()+"\t");
            System.out.print(studentInfo.get(1).toString()+"\t");
            System.out.print(studentInfo.get(2).toString()+"\t");
            System.out.print(studentInfo.get(3).toString()+"\n");
        }*/

        /*List<List<Object>> lists = studentDao.findByPage(2,0);
        for (List<Object> studentInfo:lists) {
            System.out.print(studentInfo.get(0).toString()+"\t");
            System.out.print(studentInfo.get(1).toString()+"\t");
        }*/
        List<List<Object>> o = studentDao.findCount();
        System.out.println(o.get(0).get(0));
    }
}
