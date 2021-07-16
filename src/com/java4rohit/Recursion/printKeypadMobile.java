package com.java4rohit.Recursion;

import java.util.Scanner;

public class printKeypadMobile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printkpc(str, "");

	}

	static String[] keypad = { " .;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
	private static void printkpc(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print("{"+ans+"}");
			return;
		}

		char ch = ques.charAt(0);
		String res = ques.substring(1);

		String codeforch = keypad[ch-'0'];

		for (int i = 0; i < codeforch.length(); i++) {
			char cho = codeforch.charAt(i);
			printkpc(res, ans + cho);
		}

	}

}
