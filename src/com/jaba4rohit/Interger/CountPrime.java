package com.jaba4rohit.Interger;

public class CountPrime {

	public static int CountPrimeonly(int n) {

		if (n <=2) return 0;

		boolean[] composite = new boolean[n];

		int limit = (int) Math.sqrt(n);
		System.out.println(limit);
		

		for (int i = 2; i <= limit; i++)
		{
			if (composite[i] == false)
			{
				for (int j = i*i; j < n; j=j+i) {
				
					composite[j] = true;
				}
			}
		}
		
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (composite[i] == false)count++;
			
		}
		return count;
	}

	public static void main(String[] args) {
		int n = 30;
		System.out.println(CountPrimeonly(n));

	}

}
