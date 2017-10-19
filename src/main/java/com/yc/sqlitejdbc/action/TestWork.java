package com.yc.sqlitejdbc.action;

import com.yc.sqlitejdbc.bean.Student;
import com.yc.sqlitejdbc.dao.StudentDao;
import com.yc.sqlitejdbc.factory.MyBaseDB;
import com.yc.sqlitejdbc.impl.StudentImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TestWork {
    public static void main(String[] args) {
        Connection connection = MyBaseDB.getConnection();
        String sql = "INSERT INTO Student(id,name,sex,age) values(?,?,?,?)";
        PreparedStatement ps = null;

        try {
            connection.setAutoCommit(false);
            ps = connection.prepareStatement(sql);
            ps.setObject(1, "11");
            ps.setObject(2, "2");
            ps.setObject(3, "3");
            ps.setObject(4, "4");
            ps.addBatch();
            ps.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        StudentDao studentDao = new StudentImpl();
        List<List<Object>> students = studentDao.findAll();
        for (List<Object> studentInfo:students) {
            System.out.print(studentInfo.get(0).toString()+"\t");
            System.out.print(studentInfo.get(1).toString()+"\t");
            System.out.print(studentInfo.get(2).toString()+"\t");
            System.out.print(studentInfo.get(3).toString()+"\n");
        }
        /*try {
            connection.setAutoCommit(false);
            ps = connection.prepareStatement(sql);




        }
        connection.commit();*/
    }
}
