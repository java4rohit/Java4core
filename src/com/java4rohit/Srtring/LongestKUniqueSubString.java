package com.java4rohit.Srtring;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LongestKUniqueSubString {

	public static int printcount(String str, int k) {

		int ans = 0;
		int i = -1;
		int j = -1;

		Map<Character, Integer> map = new HashMap<>();

		while (i < str.length() - 1) {
			i++;
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			if (map.size() < k) {
				continue;
			} else if (map.size() == k) {
				int len = i - j;
				if (len > ans) {
					ans = len;
				}

			} else {
				break;
			}

		}
		while (j < i) {
			j++;
			char ch = str.charAt(j);
			if (map.get(ch) == 1) {
				map.remove(ch);
			} else {
				map.put(ch, map.get(ch) - 1);
			}
			if (map.size() > k) {
				continue;
			} else if (map.size() == k) {
				int len = i - j;
				if (len > ans) {
					ans = len;
				}
				break;

			}

		}

	

		return ans;

	}

	public static void main(String[] args) {

		String str = "aabacbebebe";
		int k = 3;
		System.out.println(printcount(str, k));

	}

}
