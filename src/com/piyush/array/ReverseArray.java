package com.piyush.array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String args[])
	{
		int []number = new int[5];
		int index = 0;
		Scanner sc = new Scanner(System.in);
		 for(index=0; index<5; index++)
			 number[index] = sc.nextInt();
		 
		 sc.close();
		 
		 //Reverse Logic
		 int []reversedArray = new int[5];
		 for(index = 0; index < 5; index++)
			 reversedArray[index] = number[5 - index - 1];
		 
		 //Printing Reversed Array
		 for(index=0; index<5; index++)
			 System.out.print(reversedArray[index] + " ");
	}
}
