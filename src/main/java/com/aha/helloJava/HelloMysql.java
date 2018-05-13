package com.aha.helloJava;
import java.sql.*;
import java.util.Iterator;


public class HelloMysql {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";
		Connection conn = null;
		String url = "jdbc:mysql://localhost/zhihu?encoding=utf-8&serverTimezone=GMT%2B8";
		String user = "root";
		String password = "root";
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, password);
		Statement query = conn.createStatement();
		String sql = "show tables;";
		String sql2 = "select * from  ?  limit 10 ";
		PreparedStatement preQuery = conn.prepareStatement(sql2);
		preQuery.setString(1, "follower");

		ResultSet rSet = preQuery.executeQuery();
		while (rSet.next()) {
			System.out.println(rSet.toString());
			
		}
//		rSet.close();
//		conn.close();
//		
		
//		String tableName = null;
//		ResultSet result = query.executeQuery(sql);
//		System.out.println(result.toString());
//		while (result.next()) {
//			tableName = result.getString(1);
//			System.out.println(tableName);
//			if(tableName.contains("user")) {
//				System.out.println(tableName);
//			}
//			if (tableName.endsWith("groups")) {
//				System.out.println(tableName);
//			}

			
//			
//			
//		}

		
	}

}
