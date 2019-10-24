//Original Lexicographic Ranking - https://www.geeksforgeeks.org/lexicographic-rank-of-a-string/ - not implemented here

//check that which string comes first and capitalize the first letter 
package com.piyush.string;

import java.util.Scanner;

public class DictioneryRanking {
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string-1: ");
		String inputString1 = sc.next();
		System.out.print("Enter string-2: ");
		String inputString2 = sc.next();
		
		if(inputString1.compareTo(inputString2) > 0)
		{
			System.out.println("yes - " + inputString2 + " is smaller");
		}
		else if(inputString1.compareTo(inputString2) < 0)
			System.out.println("no - " + inputString1 + " is smaller");
		else
			System.out.println("no - both are equal");
				
		System.out.println(inputString1.substring(0,1).toUpperCase() + inputString1.substring(1) + " , " + inputString2.substring(0,1).toUpperCase() + inputString2.substring(1));
		sc.close();
	}		
}
