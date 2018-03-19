package com.yc.scanner;

/**
 * Created by Administrator on 2017/8/7 0007.
 */
public class Scanner {
    /**
     * 控制台输入信息的方法！
     * 通过 Scanner 类的 next() 与 nextLine() 方法获取输入的字符串
     */
    public static void main(String[] args) {
        for (;;) {
            System.out.println("请输出信息（之后会有结果输出）：");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            String text = scanner.next();//.next()方法不会获取空格之后的字符，比如输入baidu com，结果是baidu
//        String text1=scanner.nextLine();//.next()方法会获取空格之后的字符！
//        int num=scanner.nextInt();//控制台是可以输入字符的，但是如果输入的不是对应的类型在输出时会报错的！
//        boolean result=scanner.nextBoolean();
            System.out.println("注意：在控制台输入信息的情况下，后面的打印信息不会出现，必须在控制台输入的情况之前打印！");
            System.out.println("您好！您输入的数字是:" + text);
            System.out.println("-------------------------------------------------------");
        }
    }
}
