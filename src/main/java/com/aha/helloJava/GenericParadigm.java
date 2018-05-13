package com.aha.helloJava;


import com.aha.helloJava.Reader;
public class GenericParadigm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader<String> name = new Reader<String>();
		String yilong = "666";
		name.t = yilong;
		System.out.println(name.getT());

	}

	
	
}

