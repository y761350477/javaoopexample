package com.yc.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/8/7 0007.
 */
public class Server {
    public static void main(String[] args) {
        try {
            //1、创建一个服务端Socket，即ServerSocket，指定绑定的端口，并兼听此窗口
            ServerSocket serverSocket = new ServerSocket(8888);
            //2、调用accept（）方法开始监听，等待客户端连接
            System.out.println("***服务端即将启动，等待客户端的连接***");
            Socket socket=serverSocket.accept();
            //3、获取输入流，并读取客户端信息
            InputStream is=socket.getInputStream();//字节输入流
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String info = null;
            /*readLine()方法，作用的一次只读取一行，遇到\n，会换行读取下一行的内容！当读完的时候返回为null！*/
            while((info=br.readLine())!=null){//循环读取客户端的信息
                System.out.println("我是服务器，客户端说："+info);
            }
            socket.shutdownInput();//关闭输入流

            //4、获取输出流，相应客户端的请求
            OutputStream os=socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("我是杨福振，你是杜永宁吗？！");
            pw.flush();

            //5、关闭资源
            pw.close();
            os.close();
            br.close();
            isr.close();
            is.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
