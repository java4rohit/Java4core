package com.java4rohit.SrtringTimeStringBilder;

public class StringTimeCompression {

	public static void main(String[] args) {
		int n = 1000000;
		
		long start= System.currentTimeMillis();
//		String s="";
//		
		StringBuilder sb= new StringBuilder();
		for(int i = 0 ; i < n ; i++) {
			//s+=i;
			sb.append(i);
		}
		long end= System.currentTimeMillis();
		long dur=end-start;
		System.out.println(dur);
	}
}
