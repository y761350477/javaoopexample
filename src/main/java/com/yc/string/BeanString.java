package com.yc.string;

import java.util.ArrayList;
import java.util.List;

public class BeanString {
    public static void main(String[] args) {
        List<Str> strList = new ArrayList<>();
        Str str = new Str();
        str.setType("qq");
        str.setNum(111);
        strList.add(str);
        System.out.println(str.getType());
        System.out.println(str.getNum());
        str.setType("163");
        str.setNum(222);
        strList.add(str);
        System.out.println(str.getType());
        System.out.println(str.getNum());
        System.out.println();
        for(Str getStr : strList) {
            System.out.println(getStr.getType());
        }
    }
}
