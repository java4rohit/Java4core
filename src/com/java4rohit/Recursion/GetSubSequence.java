package com.java4rohit.Recursion;

import java.util.ArrayList;

public class GetSubSequence {

	// bc-> [--,-c,b-,bc],
	// a nhi ayenga
	// abc->[---,--c,-bc,a--],[a--,-b-,a-c,ab-,abc]
	//
	public static ArrayList<String> gss(String str) {
		//base case blank subsequence is also blan
		if (str.length() == 0){
			ArrayList<String> bres = new ArrayList<String>();
			bres.add("");
			return bres;
		}
 		char ch = str.charAt(0);// a
		
		String ros = str.substring(1);// bc
		
		ArrayList<String> rres = gss(ros);// [--,-c,b-,bc], assume

 		ArrayList<String> myres = new ArrayList<String>();
 		
		for (String rstr : rres) {
			myres.add(""+ rstr);
			myres.add(ch+ rstr);

		}
		return myres;
	}
	
	public static void main(String[] args) {
		String str = "abc";
		ArrayList<String> res = gss(str);
		System.out.println(res);

	}

}
