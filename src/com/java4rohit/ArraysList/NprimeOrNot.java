package com.java4rohit.ArraysList;

public class NprimeOrNot {
	public static void main(String[] args) {
		int n=13;
		boolean flag=false;
		
		if(n==0|| n==1) {
			System.out.println("it is not prime");
		}
		
		for(int i=2; i<=n-1; i++) {
			if(n%i==0) {
				flag = true;
				break;
			}
			
		}
		if(!flag) {
			System.out.println("it is prime");
		}
		else {
			System.out.println("it is not prime");
		}
	}

}
