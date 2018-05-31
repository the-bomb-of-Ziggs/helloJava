package com.aha.helloJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HelloFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file  = new File("src/main/resources/mysql.json");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.listRoots());
		File parent = file.getParentFile();
		//list files
		ArrayList<File> files = new ArrayList<File>();
		
		
		for (File a :parent.listFiles()) {
			System.out.println(a.toString());
			files.add(a);
		}
		System.out.println(files.toString());
		System.out.println(files.size());

		File config = new File("src/main/resources/mysql.json");
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(config)); 
        FileInputStream is = new FileInputStream(config);
        InputStreamReader isr = new InputStreamReader(is);
        int c = 0;
//        while ((c=isr.read()) != -1) {
//			System.out.println((char) c);
//		}
        
        System.out.println(is.available());
        String temp = null;
        while ((temp=reader.readLine())!=null) {
        	System.out.println(is.available());
        	System.out.println();
			System.out.println(temp);
		}			

	}

}
