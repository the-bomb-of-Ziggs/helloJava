package com.aha.helloJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;

public class SocketDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7777);
        InputStream inputStream ;
        inputStream=serverSocket.accept().getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        bufferedReader.readLine();
        int c;
        while (true){
            System.out.println(bufferedReader.readLine());
        }
//        while ((c=inputStreamReader.read())!=-1){
//
//            System.out.println((char) c);
//        }


    }

}
