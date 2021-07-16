package com.java4rohit.Queue.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DemoPriorityQueue {
	
	public static void main(String[] args) {
		
		int arr[]= {3,2,3,1,2,4,5,5,6};
		int k=4;
		
		
		PriorityQueue<Integer> n= new PriorityQueue<>();
		

		for (Integer i : arr) {
			
			n.add(i);
			System.out.println(n);
			System.out.println("size="+n.size());
			if(n.size()>k) {
				
				n.poll();
			}
			
		}
			
		
		 System.out.println(n.poll());
	}

}
