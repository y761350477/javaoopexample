package com.yc.collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> all=new ArrayList<String>();
        all.add("a");
        all.add("b");
        all.add("c");
        all.add("d");

        System.out.println("all的长度是："+all.size());
        System.out.println("all的内容是："+all);

        //增加的方法
        System.out.println("把第一个元素设置为first");
        all.add(0,"first");
        System.out.println("all的内容是："+all);
        all.add("e");
        System.out.println("all的内容是："+all);

        //修改方法
        System.out.println("把b改为B");
        all.set(2,"B");
        System.out.println("all的内容是："+all);

        //删除的方法
        System.out.println("删除d元素");
        all.remove("d");
        System.out.println("all的内容是："+all);
        System.out.println("删除e元素");
        all.remove(4);
        System.out.println("all的内容是："+all);

        //查询的方法
        for(String string : all){
            System.out.print(string + " ");
        }

        System.out.println();
        for(int i=0;i<all.size();i++){
            System.out.print(all.get(i) + " ");
        }

        System.out.println();
        System.out.println("打印 s1数组");
        //ArrayList和数组的交互
        String[] s1 = new String[all.size()];
        s1 = all.toArray(s1);
        for(String s:s1){
            System.out.print(s + " ");
        }
        System.out.println();

        //构造ArrayList的时候传值
        ArrayList<String> all2=new ArrayList<String>(all);
        System.out.println(all2);
        System.out.println(all.equals(all2));

        //在构造的时候指定容量
        ArrayList<String> all3=new ArrayList<String>(3);
        all3.addAll(all);
        System.out.println("all3的内容："+all3);
    }
}
