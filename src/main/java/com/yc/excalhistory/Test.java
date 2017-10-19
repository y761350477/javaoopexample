package com.yc.excalhistory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/12 0012.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\YC\\Desktop\\备份\\嫌疑人.xls");
        List<List<Object>> lists = ReadExcel.readExcel(file);
        int i = 0, success = 0, error = 0;
        List<SuBean> suBeanList = new ArrayList<SuBean>();
        for (List<Object> list2 : lists) {
            SuBean suBean = new SuBean();
            if (i++ == 0) continue; //表头不读取
            if (list2 == null || list2.size() == 0) break;  //读取到空结束
            if (list2.get(0).toString() == "null") {
                suBean.setCreateTime("");
            } else {
                suBean.setCreateTime(list2.get(0).toString());
            }

            if (list2.get(1).toString() == "null") {
                suBean.setSuspectName("");
            } else {
                suBean.setSuspectName(list2.get(1).toString());
            }

            if (list2.get(2).toString() == "null") {
                suBean.setSuspectSex("");
            } else {
                suBean.setSuspectSex(list2.get(2).toString());
            }

            if (list2.get(3).toString() == "null") {
                suBean.setSuspectPhone("");
            } else {
                suBean.setSuspectPhone(list2.get(3).toString());
            }

            if (list2.get(4).toString() == "null") {
                suBean.setSuspectMail("");
            } else {
                suBean.setSuspectMail(list2.get(4).toString());
            }

            if (list2.get(5).toString() == "null") {
                suBean.setSuspectQQ("");
            } else {
                suBean.setSuspectQQ(list2.get(5).toString());
            }

            if (list2.get(6).toString() == "null") {
                suBean.setSuspectHomeAddress("");
            } else {
                suBean.setSuspectHomeAddress(list2.get(6).toString());
            }

            if (list2.get(7).toString() == "null") {
                suBean.setSuspectUnitName("");
            } else {
                suBean.setSuspectUnitName(list2.get(7).toString());
            }

            if (list2.get(8).toString() == "null") {
                suBean.setSuspectUnitAddress("");
            } else {
                suBean.setSuspectUnitAddress(list2.get(8).toString());
            }

            if (list2.get(9).toString() == "null") {
                suBean.setSuspectIDCardNumber("");
            } else {
                suBean.setSuspectIDCardNumber(list2.get(9).toString());
            }

            if (list2.get(10).toString() == "null") {
                suBean.setSuspectSocialSecurity("");
            } else {
                suBean.setSuspectSocialSecurity(list2.get(10).toString());
            }

            if (list2.get(11).toString() == "null") {
                suBean.setSuspectPassport("");
            } else {
                suBean.setSuspectPassport(list2.get(11).toString());
            }

            if (list2.get(12).toString() == "null") {
                suBean.setSuspectFacebook("");
            } else {
                suBean.setSuspectFacebook(list2.get(12).toString());
            }

            if (list2.get(13).toString() == "null") {
                suBean.setSuspectTwitter("");
            } else {
                suBean.setSuspectTwitter(list2.get(13).toString());
            }

            if (list2.get(14).toString() == "null") {
                suBean.setSuspectMicroletters("");
            } else {
                suBean.setSuspectMicroletters(list2.get(14).toString());
            }

            suBeanList.add(suBean);
        }
        System.out.println(suBeanList.size());
        for (SuBean suBean : suBeanList) {
            System.out.println(suBean.getCreateTime()+suBean.getSuspectName());
        }
    }
}


