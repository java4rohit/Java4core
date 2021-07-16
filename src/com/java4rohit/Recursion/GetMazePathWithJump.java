package com.java4rohit.Recursion;

import java.util.ArrayList;

public class GetMazePathWithJump {

	public static ArrayList<String> GetMazePaths(int sr, int sc, int dr, int dc) {

		if (dr == sr && sc == dc) {
			ArrayList<String> bres = new ArrayList<String>();
			bres.add("");
			return bres;
		}

		ArrayList<String> paths = new ArrayList<String>();

		// horizonal move(ms (move size)
		for (int ms = 1; ms <= dc - sc; ms++) {
			ArrayList<String> hpaths = GetMazePaths(sr, sc + ms, dr, dc);
			for (String hpath : hpaths) {
				paths.add("h" + ms + hpath);

			}

		}

		// vertical
		for (int ms = 1; ms <= dr - sr; ms++) {
			ArrayList<String> vpaths = GetMazePaths(sr + ms, sc, dr, dc);
			for (String vpath : vpaths) {
				paths.add("h" + ms + vpath);

			}

		}

		//diagonal
		
		for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
			ArrayList<String> dpaths = GetMazePaths(sr + ms, sc + ms, dr, dc);
			for (String dpath : dpaths) {
				paths.add("d" + ms + dpath);

			}
		}
		return paths;
	}

	public static void main(String[] args) {
		int n = 2;
		int m = 2;

		ArrayList<String> paths = GetMazePaths(1, 1, n, m);

		System.out.println(paths);
	}

}
