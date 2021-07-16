package com.java4rohit.Recursion;

import java.util.Scanner;

public class PrintMazePath {
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int m= sc.nextInt();
	
	printmazePath(1,1,n,m,"");
	}

	public static void printmazePath(int sr, int sc, int dr, int dc, String psf) {
		
		if(sr>dr|| sc>dc) {
			return;
			
		}
		if(sr==dr&& sc==dc) {
			System.out.println(psf);
			return;
		}
		
		
		
		printmazePath(sr, sc+1, dr, dc, psf+"h");
		printmazePath(sr+1, sc, dr, dc, psf+"v");
	}

}
