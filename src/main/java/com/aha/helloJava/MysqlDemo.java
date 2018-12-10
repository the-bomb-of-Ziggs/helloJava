package com.aha.helloJava;

import com.alibaba.fastjson.JSONObject;

import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MysqlDemo {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/mail?serverTimezone=UTC";
    static  final  String userName = "root";
    static  final  String password = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn=null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,userName,password);
        }catch (Exception e){
            e.printStackTrace();
            System.exit(-1);
        }

        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from list limit 10");
        ArrayList<String> columns = getSchema(resultSet.getMetaData());
        while (resultSet.next()){
            ArrayList record = new ArrayList();
            for(String col : columns){
                record.add(resultSet.getObject(col));
            }
            System.out.println(JSONObject.toJSONString(record));
        }




        statement.close();
        conn.close();
    }
    public static ArrayList<String> getSchema(ResultSetMetaData metaData) throws SQLException {
        ArrayList<String> columns = new ArrayList<>();
        for(int i=1;i<metaData.getColumnCount();i++){
            columns.add(metaData.getColumnLabel(i));
        }
        return columns;
    }


    public static class StreamDemo {
        public static class Student{
            public String name;
            public  int score;
            public String getName(){
                return name;
            }

            public int getScore() {
                return score;
            }

            public Student(String name, int score){
                this.name = name;
                this.score = score;
            }
        }

        public static void main(String[] args) {
            Random random = new Random();
            ArrayList<Student> studentsList = new ArrayList<Student>();
            for(int i=0;i<30;i++){
                int score = random.nextInt(100);
                studentsList.add(new Student("student"+String.valueOf(i),score));
            }
    //        long num = studentsList.stream().filter(one ->one.score>80).sorted(Comparator.comparing(Student::getScore).reversed()).count();
            List<Integer> goodStu = studentsList.stream().filter(one ->one.score>80).sorted(Comparator.comparing(Student::getScore).reversed()).map(Student::getScore).collect(Collectors.toList());

            System.out.println(goodStu);
        }

    }
}
