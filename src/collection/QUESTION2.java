package com.java4rohit.collection;

import java.util.*;

public class QUESTION2 {
public static void main(String[] args) {
	
	//String input = "RAJUYADAVRAHULYADAVAWANISHINGZZZ";
	String input2 = "RAJU YADAV RAHUL YADAV AWANI SHING RAJU SHARMA ROSHAN";
	
	
	Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	
	  char[] inputArray= input2.toCharArray();
	  
	  
	  for (char c: inputArray) {
		  
		  charCountMap.put(c, charCountMap.get(c)!=null?charCountMap.get(c)+1:1);  
	  }
	  
	  int max=0;
	  char c = 'c';
	  for (Map.Entry<Character, Integer>entry: charCountMap.entrySet()) {
		if(charCountMap.get(entry.getKey())>max) {
			max = charCountMap.get(entry.getKey());
			c = entry.getKey();
		}
		  
		
	}
	  
	  System.out.print(c+" ");
	  System.out.println(max);
	  

	}

}
