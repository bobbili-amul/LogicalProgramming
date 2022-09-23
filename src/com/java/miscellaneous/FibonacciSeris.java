package com.java.miscellaneous;

public class FibonacciSeris {

	public static void main(String[] args) {
		int a = 0, b = 1, c;
		System.out.println(Integer.MAX_VALUE);
		System.out.print(a + " " + b);
		for (int i = 1; i <= 100; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;

		}
	}

}
