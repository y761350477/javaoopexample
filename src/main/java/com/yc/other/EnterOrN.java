package com.yc.other;

public class EnterOrN {
    public static void main(String[] args) {
        String a = "asdfsd\rbsdfasdf"; // YC_TODO: 2017/10/9 \r回车是将光标移到一行的前面（注意：回车后的数据会覆盖掉前面的数据，相当于删除当前行，重新输入/r后面的数据）
        String b = "asdfsd\nbsdfasdf"; // YC_TODO: 2017/10/9 \n是将光标移到下一行
        System.out.println(a);
        System.out.println();
        System.out.println(b);
    }
}
