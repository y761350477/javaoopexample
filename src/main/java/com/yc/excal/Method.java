package com.yc.excal;/*
package learn.excal;

import jxl.Sheet;
import jxl.Workbook;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

*/
/**
 * Created by Administrator on 2017/7/12 0012.
 *//*

public class Method {
    public static void main(String[] args) {
        getAllByExcel("C:\\Users\\Administrator\\Desktop\\新建 Excel 2003.xls");
    }

    public static List<SuBean> getAllByExcel(String file){
        List<SuBean> list=new ArrayList<SuBean>();
        try {
            Workbook rwb= Workbook.getWorkbook(new File(file));
            Sheet rs=rwb.getSheet("Test1 Shee 1");//或者rwb.getSheet(0)
            int clos=rs.getColumns();//得到所有的列
            int rows=rs.getRows();//得到所有的行

            System.out.println(clos+" rows:"+rows);
            for (int i = 1; i < rows; i++) {
                for (int j = 0; j < clos; j++) {
                    //第一个是列数，第二个是行数
                    String id=rs.getCell(j++, i).getContents();//默认最左边编号也算一列 所以这里得j++
                    String name=rs.getCell(j++, i).getContents();
                    String sex=rs.getCell(j++, i).getContents();
                    String num=rs.getCell(j++, i).getContents();

                    System.out.println("id:"+id+" name:"+name+" sex:"+sex+" num:"+num);
//                    list.add(new SuBean(Integer.parseInt(id), name, sex, Integer.parseInt(num)));
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }
}
*/
