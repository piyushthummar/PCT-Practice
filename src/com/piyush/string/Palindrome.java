package com.piyush.string;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		System.out.print("Enter string : ");
		Scanner sc = new Scanner(System.in);
		int index = 0;
		String input = sc.next();
		String reversedString = "";
		sc.close();
		
		for(index = 0; index < input.length(); index++)
		{
			reversedString += input.charAt(input.length() - index - 1);
		}
		
		System.out.println("Reversed String : " + reversedString);
		
		//Logic for Palindrome
		for(index=0; index<input.length(); index++)
		{
			if(input.charAt(index) == reversedString.charAt(index))
			{
				continue;
			}
			else
			{
				System.out.print("Aww!! String is not palindrome.");
				break;
			}
		}
		if(index == input.length())
		{
			System.out.println("Yahoo!! String is Palindrome.");
		}
	}
}
