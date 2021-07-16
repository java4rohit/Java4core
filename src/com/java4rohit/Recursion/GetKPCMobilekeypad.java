package com.java4rohit.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKPCMobilekeypad {

	static String[] codes= {" .;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	private static ArrayList<String> getKPC(String str) {
		//code enter 678
		
		/// base result 
		
		if(str.length() == 0) {
			ArrayList<String> bres= new ArrayList<String>();
			bres.add("");
			return bres;
		}
		
		char ch =str.charAt(0);// 6
		String ros=str.substring(1);//78
		
		ArrayList <String> myres= new  ArrayList<>();
		ArrayList<String> rres=getKPC(ros);
		
		String codeforch=codes[ch-'0'];
		
		for(int i=0; i<codeforch.length();i++) {
			
			char chcode= codeforch.charAt(i);
			for(String rstr:rres) {  
				myres.add(chcode+rstr);
			}
		}
		return myres;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new  Scanner(System.in);
		String str= sc.next();
		ArrayList<String> wrd=getKPC(str);
		System.out.println(wrd);
	}
	

}
