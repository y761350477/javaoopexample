package com.yc.circulation;

/**
 * Created by Administrator on 2017/8/7 0007.
 * 循环的四种方式:
 * while( 布尔表达式 ) {
 //循环内容
 }

 do {
 //代码语句
 }while(布尔表达式);

 for(初始化; 布尔表达式; 更新) {
 //代码语句
 }

 for(声明语句 : 表达式)
 {
 //代码句子
 }
 */
public class Circulation {
    public static void main(String[] args) {
        /*while循环示例*/
//        int x = 10;
//        while( x < 20 ) {
//            System.out.print("value of x : " + x );
//            x++;
//            System.out.print("\n");
//        }

        /*do...while循环示例*/
//        int x = 10;
//
//        do{
//            System.out.print("value of x : " + x );
//            x++;
//            System.out.print("\n");
//        }while( x < 20 );

        /*for循环示例*/
//        for(int x = 10; x < 20; x = x+1) {
//            System.out.print("value of x : " + x );
//            System.out.print("\n");
//        }

        /*增强for循环示例*/
//        int [] numbers = {10, 20, 30, 40, 50};
//
//        for(int x : numbers ){
//            System.out.print( x );
//            System.out.print(",");
//        }
//        System.out.print("\n");
//        String [] names ={"James", "Larry", "Tom", "Lacy"};
//        for( String name : names ) {
//            System.out.print( name );
//            System.out.print(",");
//        }

        /**break关键字示例
         * break作用跳出最里面的循环;
         * break只会跳出最里面的循环不会对外面的循环造成影响;
         */
//        int [] numbers = {10, 20, 30, 40, 50};
//
//
//        for (int j = 0; j < 10; j++) {
//            System.out.print(j);
//            for(int x : numbers ) {
//                // x 等于 30 时跳出循环
//                if( x == 30 ) {
//                    break;
//                }
//                System.out.print( "\t"+x );
//                System.out.print("\n");
//            }
//            System.out.println();
//        }

        /**continue关键字示例
         * continue作用是让程序立刻跳转到下一次循环的迭代;
         * continue同样不会对外面的循环造成影响;
         */
//        int [] numbers = {10, 20, 30, 40, 50};
//
//        for (int j = 0; j < 10; j++) {
//            System.out.print(j);
//            for(int x : numbers ) {
//                if( x == 30 ) {
//                    continue;
//                }
//                System.out.print( "\t"+x );
//                System.out.print("\n");
//                System.out.println();
//            }
//        }

        /**return关键字示例
         * return作用是跳出整个循环,和break的区别在于如果外面有循环结构一并跳出，而break不会跳出;
         * return会对外面的循环造成影响;
         */
        int [] numbers = {10, 20, 30, 40, 50};

        for (int j = 0; j < 10; j++) {
            System.out.print(j);
            for(int x : numbers ) {
                if( x == 30 ) {
                    return;
                }
                System.out.print( "\t"+x );
                System.out.print("\n");
                System.out.println();
            }
        }
    }
}
