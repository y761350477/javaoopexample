package com.yc.sqlitejdbc.impl;

import com.yc.sqlitejdbc.bean.Student;
import com.yc.sqlitejdbc.dao.StudentDao;
import com.yc.sqlitejdbc.factory.MyBaseDB;

import java.util.List;

/**
 * Created by Administrator on 2017/7/18 0018.
 */
public class StudentImpl implements StudentDao {
    public List<List<Object>> findAll() {
        String sql = "SELECT * FROM Student";
        return MyBaseDB.quert(sql,null);
    }

    public int insert(Student student) {
        String sql = "INSERT INTO Student(id,name,sex,age) values(?,?,?,?)";
        Object[] obj = new Object[4];
        obj[0] = student.getId();
        obj[1] = student.getName();
        obj[2] = student.getSex();
        obj[3] = student.getAge();
        return MyBaseDB.update(sql,obj);
    }

    public int delete() {
        String sql = "DELETE FROM Student WHERE id > 0";
        return MyBaseDB.update(sql,null);
    }

    public int deleteByBean(Student student) {
        String sql = "DELETE FROM Student WHERE id = ?";
        Object[] obj = new Object[1];
        obj[0] = student.getId();
        return MyBaseDB.update(sql,obj);
    }

    public int update(Student student) {
        String sql = "UPDATE Student SET name = ? WHERE id = ?";
        Object[] obj = new Object[2];
        obj[0] = student.getName();
        obj[1] = student.getId();
        return MyBaseDB.update(sql,obj);
    }

    public List<List<Object>> findByPage(int x, int y) {
        String sql = "select * from Student order by id limit "+x+" offset "+y;
        return MyBaseDB.quert(sql, null);
    }

    public List<List<Object>> findCount() {
        String sql = "select count(*) from Student";


        return MyBaseDB.quert(sql,null);
    }
}
