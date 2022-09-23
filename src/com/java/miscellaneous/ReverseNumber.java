package com.java.miscellaneous;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rev=0;
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		while(n>0)
		{
			rev = rev*10+n%10;
			n=n/10;
		}
System.out.println(rev);
	}

}
