package com.aha.helloJava;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Thread;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.bcel.internal.generic.JsrInstruction;


public class HelloMysql {
	
	public static void main(String args[]) throws SQLException, IOException, InterruptedException {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3308/test?useSSL=false&serverTimezone=Hongkong&useUnicode=true&characterEncoding=utf-8";
		String user = "root";
		String pwd = "";
		try{
			Class.forName(driver);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("class not found");
		}
		Connection connection = DriverManager.getConnection(url, user, pwd);
		Statement statement = connection.createStatement();
		String sql = "select * from  t_product_detail_jp_04 limit 10";
		//statement.executeQuery(sql);
		ResultSetMetaData rsmd = null;

		ResultSet rs = statement.executeQuery(sql);
		List<String> columnName = new ArrayList<>();

		rsmd = rs.getMetaData();
		for(int i=1;i<rsmd.getColumnCount();i++){
			columnName.add(rsmd.getColumnLabel(i));

		}
		Map<String,Object> record = new HashMap<>();
		rs.next();
		for (String column:columnName) {
			record.put(column,rs.getObject(column));

		}
		String oneRecord = JSONObject.toJSONString(record);
		System.out.println(oneRecord);
		String foutStr = "d:\\data\\record.json";
		//File fout = new File(foutStr);
		FileWriter fileWriter = new FileWriter(foutStr);
		fileWriter.write(oneRecord);
		fileWriter.flush();
		Thread.sleep(5000);
		fileWriter.close();




		
		
	}

}
