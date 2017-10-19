package com.yc.bookstore;

/**
 * Created by YC on 2017/5/30.
 */
public class Show {
    private Books[] books;

    public Show() {
        books = new Books[]{new Books("西游记", "10", 1),
                new Books("三国演义", "10", 1),
                new Books("水浒传", "10", 1),
                new Books("湖楼梦", "10", 1)
        };
    }

    public void lend(String name) {
        for (Books bname : books
                ) {
            if (bname.getBookname().equals(name)) {
                if (bname.getStatus() == 2) {
                    System.out.println("此书已经借出！");
                }
                bname.setStatus(2);
                break;
            }
        }
    }

    public void borrow(String name) {
        for (Books bname : books
                ) {
            if (bname.getBookname().equals(name)) {
                if (bname.getStatus() == 1) {
                    System.out.println("此书已经归还！");
                }
                bname.setStatus(1);
                break;
            }
        }
    }

    public void show() {
        String status = null;
        for (Books book : books
                ) {
            if (book.getStatus() == 1) {
                status = "未借出";
            } else {
                status = "已借出";
            }
            System.out.println("书名：" + book.getBookname() + "_价格：" + book.getPrice() + "_状态：" + status);
        }
    }

    public Books[] getBooks() {
        return books;
    }

    public void setBooks(Books[] books) {
        this.books = books;
    }

}
