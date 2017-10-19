package com.yc.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("d");
        hs.add("c");
        System.out.println("hs的内容是："+hs);

        String[] ss=new String[hs.size()];
        hs.toArray(ss);
        for(String s:ss){
            System.out.print(s+" ");
        }
        System.out.println();
        HashSet<String> hs2=new HashSet<String>();
        hs2.addAll(hs);
        System.out.println("hs2的内容是："+hs2);

        /* YC_CMT: 2017/10/19 筛选List重复内容的两种操作 */
        List<String> stringList = new ArrayList<String>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("a");
        stringList.add("a");
        Set<String> stringSet = new HashSet<String>(stringList);

        /*Set<String> stringSet = new HashSet<String>();
        stringSet.addAll(stringList);*/
        System.out.println(stringSet);
    }
}
