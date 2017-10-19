package com.yc.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator it=list.iterator();
        System.out.println("通过使用迭代器访问list的元素");
        bianli(it);

        HashSet<String> set=new HashSet<String>();
        set.add("l");
        set.add("m");
        set.add("n");
        set.add("o");
        System.out.println("通过使用迭代器访问set的元素");
        Iterator it2=set.iterator();
        bianli(it2);

        System.out.println("使用for-each遍历List");
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("使用for-each遍历set");
        for(String s:set){
            System.out.println(s);
        }
    }

    public static void bianli(Iterator it){
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
