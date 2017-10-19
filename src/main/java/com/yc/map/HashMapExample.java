package com.yc.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=
                new HashMap<Integer,String>();

        hm.put(101,"老王");
        hm.put(102,"小明");
        hm.put(103,"小老虎");
        hm.put(104,"大将军");

        Collection<String> c=hm.values();//值的集合
        Iterator<String> i1=c.iterator();
        System.out.println("姓名列表");
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        Set<Integer> keys=hm.keySet();//key的集合
        System.out.println("学号列表");
        Iterator<Integer> i2=keys.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }
        System.out.println("打印完整信息");
        for(Integer key:keys){
            System.out.println("学号："+key+",姓名："+hm.get(key));
        }
    }
}
