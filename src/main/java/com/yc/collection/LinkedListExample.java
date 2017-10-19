package com.yc.collection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        //add方法
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
        //在尾部增加元素
        list.addLast("f");
        System.out.println(list);
        //在头部增加元素
        list.addFirst("first");
        System.out.println(list);
        list.add(3,"B");
        System.out.println(list);

        String s=list.poll();
        System.out.println("poll():"+s);
        System.out.println(list);
        s=list.peek();
        System.out.println("peek():"+s);
        System.out.println(list);
        s = list.pop();
        System.out.println("pop():"+s);
        System.out.println(list);

        String[] ss=new String[list.size()];
        list.toArray(ss);
        for(String s1:ss){
            System.out.print(s1+" ");
        }
        System.out.println();
        //有参的构造方法
        LinkedList<String> list2=new LinkedList<String>(list);
        System.out.println("list2的内容："+list2);
    }
}
