package com.yc.bookstore;

/**
 * Created by YC on 2017/5/30.
 */
public class Books {
    private String bookname;//书名
    private String price;//价格
    private int status;//状态

    public Books(String bookname, String price, int status) {
        this.bookname = bookname;
        this.price = price;
        this.status = status;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

