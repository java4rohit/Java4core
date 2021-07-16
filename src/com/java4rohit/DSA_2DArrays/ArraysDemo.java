package com.java4rohit.DSA_2DArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ArraysDemo {

	//kth smallest element in arrays
	public static void main(String[] args) {

		int matrix[][] = { {1,2},{1,3}};
		PriorityQueue<Integer> o= new PriorityQueue<>(Collections.reverseOrder());
Arra
		int k =2;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int s = 0; s < matrix[i].length; s++) {
				o.add(matrix[i][s]);
				if(o.size()>k) {
					o.poll();
				}
			
			}
			
		}
		System.out.println(o.poll());
		
		
		
		
	}
}
