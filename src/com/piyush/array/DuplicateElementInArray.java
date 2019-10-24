package com.piyush.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElementInArray {
	public static void main(String args[])
	{
		int []array = new int[6];
		int index = 0;
		System.out.print("Enter 5 numbers in array : ");
		Scanner sc = new Scanner(System.in);
		 for(index=0; index<5; index++)
			 array[index] = sc.nextInt();
		 sc.close();
		 
		 Arrays.sort(array);
		 
		 ArrayList<Integer> setArray = new ArrayList<>();
		 
		 for(index = 0; index<4; index++ )
		 {
			 if(array[index] != array[index + 1])
			 {
				 setArray.add(array[index]);
			 }
		 }
		 
		 System.out.print("New Array after removing duplicates : " + setArray);
	}
}
