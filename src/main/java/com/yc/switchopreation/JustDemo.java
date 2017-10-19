package com.yc.switchopreation;

/**
 * Created by Administrator on 2017/8/7 0007.
 */
public class JustDemo {
    public static void main(String[] args) {
        //char grade = args[0].charAt(0);
        int grade = 1;

        switch(grade)
        {
            case 1 :
                System.out.println("优秀");
                break;
            case 2 :
            case 3 :
                System.out.println("良好");
                break;
            case 4 :
                System.out.println("及格");
            case 5 :
                System.out.println("你需要再努力努力");
                break;
            default :
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }
}
