package com.yc.sqlitejdbc.dao;

import com.yc.sqlitejdbc.bean.Student;

import java.util.List;

/**
 * Created by Administrator on 2017/7/18 0018.
 */
public interface StudentDao {
    List<List<Object>> findAll();
    int insert(Student student);
    int delete();
    int deleteByBean(Student student);
    int update(Student student);
    List<List<Object>> findCount();
    /*
    Sqlite的分页查询语法：
    select * from users order by id limit 10 offset 0;//offset代表从第几条记录“之后“开始查询，limit表明查询多少条结果
    运用：
    sqlitecmd.CommandText = string.Format("select * from GuestInfo order by GuestId limit {0} offset {0}*{1}", size, index-1);//size:每页显示条数，index页码
    */
    List<List<Object>> findByPage(int x, int y);
}
