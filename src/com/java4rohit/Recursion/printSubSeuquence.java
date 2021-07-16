package com.java4rohit.Recursion;

import com.java4rohit.pattern.string;

public class printSubSeuquence {
	public static void main(String[] args) {
		

		String str= "abc";
		printSS(str,"");
	}

	public  static void printSS(String ques, String ans) {
		
		if(ques.length()==0) {
			System.out.println(ans);
 			return;
		}

		
		char ch = ques.charAt(0);
		String ros= ques.substring(1);
		
		printSS(ros,ans+ "");
		printSS(ros, ans+ch);
	}

}
