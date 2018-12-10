package com.aha.helloJava;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",7777);
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        try {
            while(true){
                printWriter.write("hello,i am client\\\n");
                printWriter.flush();
                Thread.sleep(500);
            }
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }finally {
            printWriter.close();
            socket.close();
        }



    }
}
