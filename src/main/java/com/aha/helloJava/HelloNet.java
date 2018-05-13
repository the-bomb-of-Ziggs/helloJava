package com.aha.helloJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class HelloNet {
	public static void main(String[] argv) throws IOException, IOException {
		ServerSocket server = new ServerSocket(8088);
		server.accept();
		
		
		
		//client code
//		System.out.println("connecting");
//		Socket client = new Socket("www.baidu.com",80);
//		//InetAddress localaddress = InetAddress.getLocalHost();
//		OutputStream out = client.getOutputStream();
//		PrintWriter pr = new PrintWriter(out);
//		InputStream in = client.getInputStream();
//		BufferedReader br = new BufferedReader(new InputStreamReader(in));
//		String html = "hello baidu";
//		pr.write(html);
//		pr.flush();
//		client.shutdownOutput(); 
//		String b =null;
//		while ((b=br.readLine())!=null) {
//			
//			System.out.println(b);
//		}
		

		
		

	}
}
