package com.piyush.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string-1: ");
		String inputString1 = sc.next();
		System.out.print("Enter string-2: ");
		String inputString2 = sc.next();
		
		//Logic for Anagram
		char[] inputArray1 = inputString1.toCharArray();
		char[] inputArray2 = inputString2.toCharArray();
		
		Arrays.sort(inputArray1);
		Arrays.sort(inputArray2);
		
//		for(index=0; inputString1.length() == inputString2.length() && index < inputString1.length(); index++)
//		{
//			System.out.println(inputArray1[index] + " , " + inputArray2[index]);
//		}
		String outputString1 = new String(inputArray1);
		String outputString2 = new String(inputArray2);
		
		if(inputString1.length() == inputString2.length() && outputString1.equals(outputString2))
		{
			System.out.println("Yeah!! Both strings are anagram.");
		}
		else
		{
			System.out.println("Oops!! Both strings are not anagram.");
		}
 		sc.close();
		
		
	}
}
