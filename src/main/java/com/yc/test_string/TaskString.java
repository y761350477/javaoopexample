package com.yc.test_string;

import string.Str;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YC on 2017/8/21.
 */
public class TaskString {
    public static void main(String[] args) {
        List<Str> strList = new ArrayList<Str>();
        Str s_qq = new Str();
        s_qq.setType("qq");
        strList.add(s_qq);

        Str s_163 = new Str();
        s_163.setType("163");
        strList.add(s_163);

        Str s_126 = new Str();
        s_126.setType("126");
        strList.add(s_126);

        String[] strParams = {"qq", "qq", "qq", "163", "163", "126", "126", "126", "126"};
        int num_qq = 0;
        int num_163 = 0;
        int num_126 = 0;
        for (String getStr : strParams) {
            Str str = new Str();
            if (getStr.equals("qq")) {
                num_qq++;
                str.setType("qq");
                str.setNum(num_qq);
                strList.set(0, str);
            }

            if (getStr.equals("163")) {
                num_163++;
                str.setType("163");
                str.setNum(num_163);
                strList.set(1, str);
            }

            if (getStr.equals("126")) {
                num_126++;
                str.setType("126");
                str.setNum(num_126);
                strList.set(2, str);
            }
        }

        for (Str getStrParam : strList) {
            if (getStrParam.getType().equals("qq")) {
                System.out.println("qq的命中次数:\t" + getStrParam.getNum());
            }

            if (getStrParam.getType().equals("163")) {
                System.out.println("163的命中次数:\t" + getStrParam.getNum());
            }

            if (getStrParam.getType().equals("126")) {
                System.out.println("126的命中次数:\t" + getStrParam.getNum());
            }

        }

        System.out.println("---------------");
        for (int i = 0; i < strList.size() - 1; i++) {
            for (int j = 0; j < strList.size() - 1 - i; j++) {
                if (strList.get(j).getNum() < strList.get(j + 1).getNum()) {
                    Str strTemp = new Str();
                    strTemp.setType(strList.get(j).getType());
                    strTemp.setNum(strList.get(j).getNum());
                    strList.get(j).setType(strList.get(j + 1).getType());
                    strList.get(j).setNum(strList.get(j + 1).getNum());
                    strList.get(j + 1).setType(strTemp.getType());
                    strList.get(j + 1).setNum(strTemp.getNum());
                }
            }
        }

        for (Str getSort : strList
             ) {
            System.out.println(getSort.getType() + "\t命中次数:" + getSort.getNum());
        }
    }

        /*int a[] = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }*/

        /*for (int i = 0; i < a.length; i++)
            System.out.print(a[i]+"\t");
        }*/




        /*List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("未修改前:");
        for (String s : list) {
            System.out.println(s);
        }

        list.set(0, "修改之后的元素");//修改对应的元素
        System.out.println("已修改后:");
        for (String s : list) {
            System.out.println(s);
        }*/
}
