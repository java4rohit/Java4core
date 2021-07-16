package com.java4rohit.DSA_Arrays;

import java.util.ArrayList;
import java.util.List;

public class AddArraystoInteger {
	public static void addToArrayForm(int[] num, int k) {
		List<Integer> result = new ArrayList<>();

		for (int i = num.length - 1; i >= 0; i--) {
			int n = num[i];
			int sum = n + k;
			int remain = sum % 10;
			result.add(0, remain);
			k = sum / 10;
		}

		while (k > 0) {
			result.add(0, k % 10);
			k = k / 10;
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		int n = 456;
		addToArrayForm(arr, n);
	
	}

}
