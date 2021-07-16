package com.java4rohit.DSA_Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.SortedSet;

public class FindTheKthLagest {

	public static void findKthLargest(int[] nums, int k) {
//		int m = 0;
//		int i = 0;
//		int n= nums.length;
//	
//		for (i = 0; i < n - 1; i++) {
//
//			for (int j = i + 1; j < n; j++) {
//
//				if (nums[i] < nums[j]) {
//					int temp = nums[i];
//					nums[i] = nums[j];
//					nums[j] = temp;
//				}
//			}
//			
//			if(i==k-1) {
//				System.out.println(nums[i]);
//			}
//		
//		}
//		for(i = 0 ;i< n ; i++) {
//		System.out.print(nums[i]+" ");
//		}
//	}
		
		PriorityQueue<Integer> n= new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for (Integer in : nums) {
			n.add(in);
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {3,3,5,4,6,5,8};
		int k = 2;

	findKthLargest(arr, k);

	}

}
