package com.java4rohit.DynamicProgramming;

import java.util.Scanner;

public class ClimbStairs {
	
	
	public static int countpath(int n, int  qb[]  ) {
		
		if(n==0) {
			
			return 1;
		}
		
		else if(n<0) {
			return 0;
			
		}
		
		else if(qb[n]>0) {
			return qb[n];
		}
		int cp1= countpath(n-1, qb);
		int cp2= countpath(n-2, qb);
		int cp3= countpath(n-3, qb);
		
		int cpn=cp1+cp2+cp3;
		
		qb[n]=cpn;
		return cpn;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int cp= countpath(n,new int[n+1]);
		System.out.println(cp);
		
	}

}
