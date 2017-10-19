package com.yc.other;

/**
 * Created by Administrator on 2017/8/7 0007.
 */
public class RandomNumExample {
    public static void main(String[] args) {
        //Math.random()生成0.0<=x<1.0,所以想生成100以内的整数需要强制转换类型
        //(int)(Math.random()*100)产生一个100以内的整数
        //1+(int)(Math.random()*50)
        int x=(int)(Math.random()*100);//产生一个100以内的整数
        int y=1+(int)(Math.random()*2);//产生一个1~50之间的整数
        System.out.println(x);
        System.out.println(y);
    }
}
