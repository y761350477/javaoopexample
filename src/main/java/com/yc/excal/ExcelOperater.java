package com.yc.excal;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelOperater {
    public static void main(String[] args) {
        jxl.Workbook readwb = null;
        try {
            //构建Workbook对象, 只读Workbook对象
            //直接从本地文件创建Workbook
            InputStream instream = new FileInputStream("C:\\Users\\YC\\Desktop\\嫌疑人批量导入模版.xls");
            readwb = Workbook.getWorkbook(instream);
            //Sheet的下标是从0开始
            //获取第一张Sheet表
            Sheet sheet = readwb.getSheet(0);
            Sheet readsheet = sheet;
            //获取Sheet表中所包含的总列数
            int rsColumns = readsheet.getColumns();
            //获取Sheet表中所包含的总行数
            int rsRows = readsheet.getRows();
            System.out.println("rsRows:\t" + rsRows);
            //获取指定单元格的对象引用
            List<SuBean> lists = new ArrayList<SuBean>();
            for (int i = 0; i < rsRows; i++) {
                SuBean suBean = new SuBean();
                if (i == 0) {
                    continue;
                }
                for (int j = 0; j < rsColumns; j++) {
                    Cell cell = readsheet.getCell(j, i);
                    if(j == 0) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setCreateTime("");
                        } else {
                            suBean.setCreateTime(cell.getContents().toString());
                        }

                    }

                    if(j == 1) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setSuspectName("");
                        } else {
                            suBean.setSuspectName(cell.getContents().toString());
                        }

                    }

                    if(j == 2) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setSuspectSex("");
                        } else {
                            suBean.setSuspectSex(cell.getContents().toString());
                        }

                    }

                    if(j == 3) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setSuspectPhone("");
                        } else {
                            suBean.setSuspectPhone(cell.getContents().toString());
                        }

                    }

                    if(j == 4) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setSuspectMail("");
                        } else {
                            suBean.setSuspectMail(cell.getContents().toString());
                        }

                    }

                    if(j == 5) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setSuspectQQ("");
                        } else {
                            suBean.setSuspectQQ(cell.getContents().toString());
                        }

                    }

                    if(j == 6) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setSuspectHomeAddress("");
                        } else {
                            suBean.setSuspectHomeAddress(cell.getContents().toString());
                        }

                    }

                    if(j == 7) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setSuspectUnitName("");
                        } else {
                            suBean.setSuspectUnitName(cell.getContents().toString());
                        }

                    }

                    if(j == 8) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setSuspectUnitAddress("");
                        } else {
                            suBean.setSuspectUnitAddress(cell.getContents().toString());
                        }

                    }

                    if(j == 9) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setSuspectIDCardNumber("");
                        } else {
                            suBean.setSuspectIDCardNumber(cell.getContents().toString());
                        }

                    }

                    if(j == 10) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setSuspectSocialSecurity("");
                        } else {
                            suBean.setSuspectSocialSecurity(cell.getContents().toString());
                        }

                    }

                    if(j == 11) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setSuspectPassport("");
                        } else {
                            suBean.setSuspectPassport(cell.getContents().toString());
                        }

                    }

                    if(j == 12) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setSuspectFacebook("");
                        } else {
                            suBean.setSuspectFacebook(cell.getContents().toString());
                        }

                    }

                    if(j == 13) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setSuspectTwitter("");
                        } else {
                            suBean.setSuspectTwitter(cell.getContents().toString());
                        }

                    }

                    if(j == 14) {
                        if(cell.getContents().equals("") || cell.getContents().equals(null)) {
                            suBean.setSuspectMicroletters("");
                        } else {
                            suBean.setSuspectMicroletters(cell.getContents().toString());
                        }

                    }

                    System.out.print(cell.getContents() + " ");

                }
                lists.add(suBean);
                System.out.println();
            }
            System.out.println(lists.size());
            for(SuBean list : lists) {
                System.out.println(list.getSuspectName()+"\t"+list.getCreateTime());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readwb.close();
        }

    }
}
