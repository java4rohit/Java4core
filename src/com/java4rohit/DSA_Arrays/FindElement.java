package com.java4rohit.DSA_Arrays;

public class FindElement {

	private static int searchElemt(int[] nums, int k) {
		int n = nums.length;
		int l = 0;
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] == k) {
				l = i;
				return l;
			}

		}
		return 0;

	}

	public static void main(String[] args) {

		int arr[] = {1,3,5,6 };
		int k = 2;
		
		System.out.println(searchElemt(arr, k));

	}

}
