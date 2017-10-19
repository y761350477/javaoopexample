package com.yc.instanceofopration;

/**
 * Created by Administrator on 2017/8/7 0007.
 * instanceof 运算符的使用:
 * ( Object reference variable ) instanceof  (class/interface type)
 * 判断一个对象是否是特定类型的实例，如果是返回true，否返回false（前提,对象和类型有继承关系才能比较，不然会直接报错，参看下面的DDD的实例判断）;
 */
public class InstanceofDemo {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();
        CCC ccc = new CCC();
//        DDD ddd = new DDD();
        System.out.println(bbb instanceof AAA);
        System.out.println(ccc instanceof BBB);
        System.out.println(aaa instanceof CCC);
//        System.out.println(aaa instanceof DDD);
    }
}

class AAA{
    String a_id;
    String b_name;

}

//BBB是AAA的子类
class BBB extends AAA{
    String b_id;
    String b_name;
}

//CCC是BBB的子类
class CCC extends BBB{
    String c_id;
    String c_name;
}

class DDD{

}

