package com.aha.helloJava;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.w3c.dom.Text;

import com.alibaba.fastjson.JSONObject;



public class HelloJson {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HelloJson hj = new HelloJson();
		hj.parseJson("src/main/resources/mysql.json");
		
        


	}
	
	public void parseJson(String fileName) throws IOException{
		//"src/main/resources/mysql.json"
		File file  = new File(fileName);

		FileReader fReader = new FileReader(file);
	
		BufferedReader reader = new BufferedReader(fReader);
		String text = null;
		String json_str = "";
		ArrayList<String> lines = new ArrayList<String>();
		while((text=reader.readLine())!=null) {
			//System.out.println(text);
			json_str+=text;
			lines.add(text);
			
		}
		
		System.out.println(json_str);
		System.out.println(json_str.length());
		System.out.println(json_str.substring(0, json_str.length()-1));
		
//		JSONObject json = JSONObject.parseObject(json_str);
//		
//		System.out.println(json.getString("url"));		
		
	}
	
	
	
	
	

}
