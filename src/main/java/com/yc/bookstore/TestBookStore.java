package com.yc.bookstore;

import java.util.Scanner;

/**
 * Created by YC on 2017/5/30.
 */
public class TestBookStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Show show = new Show();
        for (; ; ) {
            System.out.println("业务如下：1、借\t2、还\t3、退出");
            System.out.println("请输入序号：");
            int x = input.nextInt();
            if (x == 1) {
                show.show();
                System.out.println("请输出名字：");
                String x1 = input.next();
                show.lend(x1);
                show.show();
                System.out.println();
            }
            if (x == 2) {
                show.show();
                System.out.println("请输出名字：");
                String x1 = input.next();
                show.borrow(x1);
                show.show();
                System.out.println();
            }
            if (x == 3) {
                break;
            }
        }
    }
}
