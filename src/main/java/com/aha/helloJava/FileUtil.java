package com.aha.helloJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtil {


    public static void main(String[] args) throws IOException {
//        String config = readContent("E:\\workspace\\ynzw\\src\\main\\resources\\cluster.config");
//        JSONObject json = (JSONObject) JSONObject.parse(config);
//        System.out.println(json.get("redis.host"));
//        String head = "name,year,country,fans,page";
//        String [] columns = head.split(",");
//        HashMap<String,String> record = new HashMap<>();
//        int i = 0;
//        for(String column:columns){
//            record.put(column,String.valueOf(i));
//            i+=1;
//        }
//        System.out.println(record);
//        String  json = JSONObject.toJSONString(record);
//        System.out.println(json);
//        record.clear();
//        File out = new File("hello.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream(out);
//        OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream);
//        writer.write("this is a output test");
//        writer.flush();
//        writer.close();








        //按字符读取文件
//        File file = new File("E:\\\\workspace\\\\ynzw\\\\src\\\\main\\\\resources\\\\cluster.config");
//        FileInputStream fileInputStream = new FileInputStream(file);
//        fileInputStream.getChannel().lock();
//
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//        InputStreamReader reader = new InputStreamReader(fileInputStream);
//        String body = "";
//        int temp;
//        while((temp=reader.read())!=-1){
//            System.out.println((char)temp);
//            body += String.valueOf((char) temp);
//        }
//        System.out.println(body);

    }


    public static void print(String[] args) throws IOException {
        String path = "d:\\data\\airflow.cfg";
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = bufferedReader.lines().collect(Collectors.toList());
        for (String line : lines){
            System.out.println(line);
        }
    }

    public static String readContentV2(String path) throws FileNotFoundException {
//        path = "d:\\data\\airflow.cfg";
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Stream lines = bufferedReader.lines();
        return lines.reduce((s1,s2)->s1.toString()+s2.toString()).get().toString();
    }


    public static String readContent(String path) throws IOException {
//        String path = "d:\\data\\airflow.cfg";
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int i = 0;
        String configbody = "";
//        Iterator iterator = (Iterator) bufferedReader.lines();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        while (bufferedReader.ready()){
//            bufferedReader.skip(1000);
            configbody+=bufferedReader.readLine();
        }

        return configbody;

//        File config = new File(path);
//        Long length = config.length();
//        System.out.println(length);
////        InputStream inputStream = null;
//
//        FileInputStream fileInputStream = new FileInputStream(config);


    }

}
