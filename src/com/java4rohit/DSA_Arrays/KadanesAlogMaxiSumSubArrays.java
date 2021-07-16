package com.java4rohit.DSA_Arrays;

public class KadanesAlogMaxiSumSubArrays {

	private static void maxiSumArray(int[] arr) {

		if (arr[arr.length - 1] < 0) {
			System.out.println(arr[arr.length - 1]);
		} else {
			int currSum = 0;
			int overalsum = 0;

			for (int i = 0; i < arr.length; i++) {

				if (currSum >= 0) {
					currSum = currSum + arr[i];
				} else {
					currSum = arr[i];
				}
				if (currSum > overalsum) {
					overalsum = currSum;
				}

			}
			System.out.println(overalsum);
		}
	}

	public static void main(String[] args) {

		int arr[] = { -2,1,-3,4,-1,2,1,-5,4 };

		maxiSumArray(arr);
	}

}
