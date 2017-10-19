package com.yc.saleticket;

/**
 * Created by Administrator on 2017/8/7 0007.
 */
public class SaleTicket {
    /**
     * 卖票来测试实例变量和静态变量的区别！
     */
    public int ticket=100;
    public static int s_ticket=100;

    public void sale(){
        ticket--;
        System.out.println(ticket);
    }
    public void s_sale(){
        s_ticket--;
        System.out.println(s_ticket);
    }

    public static void main(String[] args) {
        SaleTicket t1=new SaleTicket();
        System.out.println("实例变量的效果：");
        t1.sale();
        SaleTicket t2=new SaleTicket();
        t2.sale();
        System.out.println("静态变量的效果：");
        t1.s_sale();
        t2.s_sale();
    }
}
