package com.yc.export;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExportExcel {
    public static void main(String[] args) throws IOException {
        /*try {
            // 打开文件
            WritableWorkbook book = Workbook.createWorkbook(new File(
                    "test.xls"));
            // 生成名为“sheet1”的工作表，参数0表示这是第一页
            WritableSheet sheet = book.createSheet("sheet1", 0);
            // 在Label对象的构造子中指名单元格位置是第一列第一行(0,0),单元格内容为string
            Label label = new Label(0, 0, "string");
            // 将定义好的单元格添加到工作表中
            sheet.addCell(label);
            // 生成一个保存数字的单元格,单元格位置是第二列，第一行，单元格的内容为1234.5
            Number number = new Number(1, 0, 1234.5);
            sheet.addCell(number);
            // 生成一个保存日期的单元格，单元格位置是第三列，第一行，单元格的内容为当前日期
            DateTime dtime = new DateTime(2, 0, new Date());
            sheet.addCell(dtime);
            // 写入数据并关闭文件
            book.write();
            book.close();
        } catch (Exception e) {
            System.out.println(e);
        }*/

        // 创建Excel的工作书册 Workbook,对应到一个excel文档
        HSSFWorkbook wb = new HSSFWorkbook();

        // 创建Excel的工作sheet,对应到一个excel文档的tab
        HSSFSheet sheet = wb.createSheet("sheet1");

        // 创建Excel的sheet的一行
        HSSFRow row = sheet.createRow(0);

        // 创建一个Excel的单元格
        HSSFCell cell = row.createCell(0);

        // 给Excel的单元格设置样式和赋值
        cell.setCellValue("序号");

        cell = row.createCell(1);
        cell.setCellValue("状态");

        cell = row.createCell(2);
        cell.setCellValue("发件人");

        cell = row.createCell(3);
        cell.setCellValue("主题");

        cell = row.createCell(4);
        cell.setCellValue("时间");

        cell = row.createCell(5);
        cell.setCellValue("文件大小");

        cell = row.createCell(6);
        cell.setCellValue("附件");

        FileOutputStream os = null;
        try {
            os = new FileOutputStream("C:\\Users\\YC\\Desktop\\test.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // FileOutputStream os = new FileOutputStream("c:\\spider\\tex.xls");
        wb.write(os);
        os.close();

    }
}
