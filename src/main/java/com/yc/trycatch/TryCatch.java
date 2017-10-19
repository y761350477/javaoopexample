package com.yc.trycatch;

/**
 * Created by Administrator on 2017/8/7 0007.
 */
public class TryCatch {
    public int test1() {
        int divider=10;
        int result=100;
        try{
            while(divider>-1){
                divider--;
                result=result+100/divider;
            }
            return result;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("循环抛出异常了！");
            return -1;
        }
    };

    public int test2() {
        int divider=10;
        int result=100;
        try{
            while(divider>-1){
                divider--;
                result=result+100/divider;
            }
            return result;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("循环抛出异常了！");
            return result=999;
        }finally{
            System.out.println("我是finally!!哈哈！！");
            System.out.println("我是result！我的值是"+result);
        }
    };

    public static void main(String[] args) {
        TryCatch tcc=new TryCatch();
        int result=tcc.test1();
        System.out.println("test()执行完毕！返回值为:"+result);
        result=tcc.test2();
        System.out.println("我想大声告诉你！finally执行完毕！");
    }

}
