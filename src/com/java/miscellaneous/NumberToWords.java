package com.java.miscellaneous;

import java.util.Scanner;

public class NumberToWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a digit");
		int number = sc.nextInt();
           
		String[] uw = { " ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
				  "ten", "eleven", "tweleve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen" ,"nineteen"};
		
		String[] tens = {" ","ten","twentry","thirty","fourty","fifty","sixty","seventy","eighty","nintey"};
		String hw = "hundred";
		
		if(number<20)
		{
			System.out.println(uw[number]);
		}
		else if(number<100)
		{
			//94 ninty four 
			int up = number%10;
			int tp = number/10;
			System.out.println(tens[tp]+" "+uw[up]);
			
		}
		else 
		{
			//945
			int up = number%10;
			int tp = (number%100)/10;
			int hp = number/100;
			System.out.println(uw[hp]+" "+hw+" "+tens[tp]+" "+uw[up]);
		}
	}

}
