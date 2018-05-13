package com.aha.helloJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class HelloFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//要按行读文件相比于python一行代码，Java需要五行
		File input = new File("e://data//associate.csv");
		InputStream is = null;
		is = new FileInputStream(input);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		int num = 0;
		while (br.read()!=-1 && num < 20) {
			System.out.println(br.readLine());
			num +=1 ;
		}
		
	
		
//		while(is.read()!=-1) {
//		byte c[] = new byte[1024];
//		is.read(c);
//		System.out.println(new String(c));			
//			
//		}
//		StringBuffer sb = new StringBuffer();
//		while (is.read()!=-1) {
//			byte c[] = new byte[1024];
//			is.read(c);
//			sb.append(new String(c));
//		}
//		System.out.println(sb.toString());
		
		
//		FileReader fReader = new FileReader(input);
//		
//		
//		System.out.println(fReader.read());
		
		
		//InputStreamReader isr = new InputStreamReader(fReader);
		
		
	}
	
	

}
