package com.java4rohit.SrtringTimeStringBilder;

public class ToggleCase extends Object {

	public static String solution(String str) {
		StringBuilder sb = new StringBuilder(str);
		
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				char uc = (char) (ch -'a'+'A');
				sb.setCharAt(i, uc);
			}

			else if (ch >= 'A' && ch <= 'Z') {
				char lc = (char) (ch-'A'+'a');
				sb.setCharAt(i, lc);
			}
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		String str = "ROhit YAdav";
		System.out.println(solution(str));
	}
}
