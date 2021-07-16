package com.java4rohit.Recursion;

import java.util.ArrayList;

public class GetMazePaths {

	public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {

		// sr- stating row
		// sc- starting column
		// dr- distination row
		// dc- destination column

		// base case.
		if (sr == dr && sc == dc) {
			ArrayList<String> bres = new ArrayList<String>();
			bres.add("");
			return bres;
		}

		ArrayList<String> hpath = new ArrayList<>();
		ArrayList<String> vpath = new ArrayList<>();
 
		if (sc < dc) {

			hpath = getMazePath(sr, sc + 1, dr, dc);
		}

		if (sr < dr) {

			vpath = getMazePath(sr + 1, sc, dr, dc);
		}

		ArrayList<String> paths = new ArrayList<String>();

		for (String hpaths : hpath) {

			paths.add("h" + hpaths);
		}

		for (String vpaths : vpath) {
			paths.add("v" + vpaths);
		}
		return paths;
	}

	public static void main(String[] args) {

		int n = 3;
		int m = 3;
		ArrayList<String> paths = getMazePath(1, 1, n, m);
		System.out.println(paths);

	}
   
}
