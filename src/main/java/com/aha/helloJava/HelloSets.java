package com.aha.helloJava;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HelloSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> score = new ArrayList<Integer>();
		String name = "yilong";
		score.add(65);
		score.add(82);
	
		Map<String, ArrayList<Integer> >scores = new HashMap();
		scores.put(name, score);
		System.out.println(scores.keySet());
		System.out.println(scores.get(name));
		
		

	}

}
