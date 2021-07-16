package com.java4rohit.Recursion;

import java.util.Scanner;

public class PrintJumpMazePath {
	
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int m  =sc.nextInt();
	
	PrintMazePath(1,1,m,n,"");
	}

	public static void PrintMazePath(int sc, int sr, int dc, int dr, String path) {
		if(sr==dr && sc==dc) {
			System.out.println(path);
			return;
		}
		
		
		for(int ms =1; ms<=dc-sc; ms++) {
		PrintMazePath(sc+ms, sr, dc, dr, path+"h"+ms);
		}
		for(int ms =1; ms<=dr-sr; ms++) {
			PrintMazePath(sc, sr+ms, dc, dr, path+"v"+ms);
			}
		
		for(int ms =1; ms<=dr-sr&& ms<=dc-sc; ms++) {
			PrintMazePath(sc+ms, sr+ms, dc, dr, path+"v"+ms);
			}
	}

}
