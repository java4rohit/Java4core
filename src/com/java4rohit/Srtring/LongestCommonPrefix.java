package com.java4rohit.Srtring;

import java.util.Scanner;

public class LongestCommonPrefix {

	private static String longCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return " ";

		}
		String lcp = strs[0];

		for (int i = 1; i < strs.length; i++) {

			String currWord = strs[i];

			int j = 0;
			
			while (j < currWord.length() && j < lcp.length() && lcp.charAt(j) == currWord.charAt(j)) {
				j++;
			}

			if (j == 0)
				return " ";

			lcp = currWord.substring(0, j);

		}
		return lcp;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
 		int n = sc.nextInt();
		String[] strs = new String[n];

		for (int i = 0; i < n; i++) {
			strs[i] = sc.next();
		}

		System.out.println(longCommonPrefix(strs));

	}

}
