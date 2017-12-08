package com.yc.genericity;

import java.util.ArrayList;
import java.util.List;

public class WhyUsingGenericity {
    public static void main(String[] args) {
        /*
         * YC_CMT:
         * 2017/10/19
         *
         * ArrayList可以添加多种类型的对象数据，会导致在取值时无法把控，所以加入泛型加以约束；
         */
        List arrayList = new ArrayList();
        arrayList.add("Tom");
        arrayList.add("Joly");
        arrayList.add(1);

        for (Object object : arrayList) {
            String getValue = (String) object;
            System.out.println(getValue);
        }

    }
}
