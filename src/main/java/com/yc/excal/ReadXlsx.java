package com.yc.excal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class ReadXlsx {

    public static void main(String[] args) throws Exception {
        XSSFRow row = null;
        // 1. 读取文件输入流
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\YC\\Desktop\\测试用的模版\\嫌疑人批量导入模版.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        // 2. 获取 sheet
        XSSFSheet spreadsheet = workbook.getSheetAt(0);
        XSSFSheet readsheet = spreadsheet;
        Iterator<Row> rowIterator = spreadsheet.iterator();
        while (rowIterator.hasNext()) {
            // 获得行 迭代
            row = (XSSFRow) rowIterator.next();
            // 获得单元格
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                // 单元格数据类型
                switch (cell.getCellType()) {
                    // case Cell.CELL_TYPE_NUMERIC:
                    // System.out.print(cell.getNumericCellValue() + " \t\t ");
                    // break;
                    case Cell.CELL_TYPE_NUMERIC: //数字
                        System.out.print("null"+"\t\t");
                        break;
                    case Cell.CELL_TYPE_BLANK:
                        System.out.print("null"+"\t\t");
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + " \t\t ");
                        break;
                }
            }
            System.out.println();
        }
        fis.close();
    }
}

