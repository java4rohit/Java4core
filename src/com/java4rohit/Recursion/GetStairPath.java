package com.java4rohit.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPath {

	public static void main(String[] args) {

		int n = 4;
		ArrayList<String> paths = getStairPath(n);
		System.out.println(paths);
	}
	
	public static ArrayList<String> getStairPath(int n) {
		
		//base case when step =0 
		if (n == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		} else if (n < 0) {
			ArrayList<String> bres = new ArrayList<>();
			return bres;
		}
		ArrayList<String> paths1 = getStairPath(n - 1); // 1 setp;
		ArrayList<String> paths2 = getStairPath(n - 2); //2 step;
		ArrayList<String> paths3 = getStairPath(n - 3); //3 step;

		ArrayList<String> paths = new ArrayList<>();
		
		for (String path : paths1) {
			paths.add(1 + path);
		}

		for (String path : paths2) {
			paths.add(2 + path);

		}
		for (String path : paths3) {
			paths.add(3 + path);

		}
		return paths;
	}

}
