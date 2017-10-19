package com.yc.array;

/**
 * Created by Administrator on 2017/8/7 0007.
 */
public class ArrayExample {
    /**
     * 数组的几种声明方式！
     * @param args
     */
    public static void main(String[] args) {
        String ss[]=new String[10];
        String[] s=new String[10];
        String[] s1={"1","2","3"};
        String[] s2=new String[]{"1","2","3"};
        System.out.println("ss的长度："+ss.length);
        System.out.println("s的长度："+s.length);
        System.out.println("s1的长度："+s1.length);
        System.out.println("s2的长度："+s2.length);
    }
}
