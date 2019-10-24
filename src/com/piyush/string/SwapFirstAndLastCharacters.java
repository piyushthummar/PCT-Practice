package com.piyush.string;

import java.util.Scanner;

public class SwapFirstAndLastCharacters {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String inputString = sc.nextLine();
		sc.close();
			
		char[] charArray = inputString.toCharArray();
		//Swapping of only first and last character of line
		char first;
		first = charArray[0];
		charArray[0] = charArray[inputString.length() - 1];
		charArray[inputString.length() - 1] = first;
		
		String outputString = new String(charArray);
		System.out.println("Swapping first & last characters of line");
		System.out.println(outputString);
		
		//Swapping of first and last character of every string
		charArray = inputString.toCharArray();
		int index2 = 0;
		System.out.println(charArray.length);
		for(int index=0; index<inputString.length(); index++)
		{
			char temp;
			if(charArray[index] == ' ')
			{
				temp = charArray[index-1];
				charArray[index-1] = charArray[index2];
				charArray[index2] = temp;
				index2 = index+1;
			}
			if(index == inputString.length() - 1)
			{
				temp = charArray[index];
				charArray[index] = charArray[index2];
				charArray[index2] = temp;
			}
		}
		
		outputString = new String(charArray);
		System.out.println("\nSwapping first & last characters of every string");
		System.out.println(outputString);
	}
}
