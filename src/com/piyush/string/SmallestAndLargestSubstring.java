package com.piyush.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargestSubstring {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String inputString = sc.next();
		System.out.print("Enter Length: ");
		int inputLength = sc.nextInt();
		sc.close();
		
		int index=0;
		String largest = "";
		String smallest = "";
		
		//Logic-1
		for(index=0; index<inputString.length(); index++)
		{
			for(int index2 = index + inputLength; index2 <= inputString.length(); index2++)
			{
				
				String subString = inputString.substring(index, index2);
				if(subString.length() == inputLength)
				{
					if(subString.compareTo(largest) > 0)
						largest = subString;
					if(subString.compareTo(smallest) < 0 || smallest == "")
						smallest = subString;
				}
				//System.out.println("smallest substring : " + smallest + "\nlargest substring : " + largest);
			}
		}
		System.out.println("Answer according to Logic-1");
		System.out.println("smallest substring : " + smallest + "\nlargest substring : " + largest);
		
		//Logic-2
		ArrayList<String> filteredList = new ArrayList<String>();
		for(index=0; index<inputString.length();index++)
		{
			for(int index2 = index + inputLength; index2 <= inputString.length(); index2++)
			{
				String subString = inputString.substring(index, index2);
				if(subString.length() == inputLength)
				{
					filteredList.add(subString);
				}
				
			}
		}
		//System.out.println(filteredList);
		String[] filteredArray = filteredList.toArray(new String[filteredList.size()]);
		Arrays.sort(filteredArray);
		
		smallest = filteredArray[0];
		largest = filteredArray[filteredList.size() - 1];
		System.out.println("Answer according to Logic 2");
		System.out.println("smallest substring : " + smallest + "\nlargest substring : " + largest);
	}
}
