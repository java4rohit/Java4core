package com.java4rohit.timeAndSpaceSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertionSort {
	
	public void insertionSort(int[] arr, int n) {
		
		
	} 


	public void print(int[] arr, int n) {
		for(  int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
	}

	
	
	public static void main(String[] args) {
		int[] arr= {2,45,6};

		int n = arr.length;
		InsertionSort Is = new InsertionSort();
		Is.insertionSort(arr,n);
		
		Is.print(arr,n);
	}

	

}
