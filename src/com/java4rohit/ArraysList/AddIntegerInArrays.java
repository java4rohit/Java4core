package com.java4rohit.ArraysList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddIntegerInArrays {

	public static List<Integer> addToArray(int[] A, int K) {
		int N = A.length;
		int cur = K;
		List<Integer> ans = new ArrayList();

		int i = N;
		while (--i >= 0 || cur > 0) {
			if (i >= 0)
				cur += A[i];
			ans.add(cur % 10);
			cur /= 10;
		}

		Collections.reverse(ans);
		return ans;
	}

	public static void main(String[] args) {
 
		int arr[] = {2,1,5};
		int k = 806;
		//addToArrayForm(arr, k);
		System.out.println(addToArray(arr,k));
	}

}
