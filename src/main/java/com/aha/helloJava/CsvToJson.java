package com.aha.helloJava;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.supercsv.io.CsvListReader;

import org.supercsv.prefs.CsvPreference;
import com.alibaba.fastjson.JSONObject;




public class CsvToJson {
	
	public static void main(String argv[]) {
		String fname = "d:\\data\\au_detail.csv";
		CsvToJson convert = new CsvToJson();
		try {
			convert.readfile(fname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readfile(String fname) throws IOException {
		
		CsvListReader reader = new CsvListReader(new FileReader(new File(fname)), CsvPreference.EXCEL_PREFERENCE);
		 String[] header = reader.getHeader(true);
		 for( String column :header) {
			 System.out.println(column);
		 }
		 ArrayList<List<String>> content = new ArrayList<List<String>>();
		 List<String> line ;
		 while ((line= reader.read())!=null) {
			content.add(line);
			 System.out.println(line);
			 break;
		}
		 
		 ArrayList<Map<String, String>> jsons = new ArrayList<>();
		 for(List record:content) {
			 Map recordMap = new HashMap<>();
			 int index = 0;
			 for(String key:header) {
				 
				 recordMap.put(key, record.get(index));
				 index+=1;
				 
			 }
			 String jsonStr = null;
			 jsonStr =  JSONObject.toJSONString(recordMap);
			 System.out.println(jsonStr);

			 
			 
		 }
		 
		 
		 
	}
	
	

}
