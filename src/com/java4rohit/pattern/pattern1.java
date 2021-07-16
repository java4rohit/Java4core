package com.java4rohit.pattern;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {

		int n = 5;

		System.out.println("------1--------");
		for (int i = 1; i <= n; i++) {
//		     *
//	         ** 
//	         *** 
//	         **** 
//	         ***** 
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println(" ");
		}
//	
		System.out.println("------2--------");

		for (int i = 1; i <= n; i++) {
//			****
//			*** 
//			**
//			*
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("------3--------");
		for (int i = 1; i <= n; i++) {

//			*
//		   **
//		  ***
//		 ****
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------4--------");
		for (int i = 1; i <= n; i++) {

//			****
//			 ***
//			  ** 
//			   *
			for (int j =2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = n; k >=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		 *
//		* * 
//	  * * * * 
//	* * * * * * 
		
		
		

	}

}
