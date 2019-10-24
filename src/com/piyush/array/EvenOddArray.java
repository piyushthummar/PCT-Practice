package com.piyush.array;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddArray {
	public static void main(String args[])
	{
		int []array = new int[6];
		int index = 0;
		System.out.print("Enter 6 numbers in array : ");
		Scanner sc = new Scanner(System.in);
		 for(index=0; index<6; index++)
			 array[index] = sc.nextInt();
		 
		 ArrayList<Integer> oddArray = new ArrayList<Integer>();
		 ArrayList<Integer> evenArray = new ArrayList<Integer>();
		 for(index = 0; index < 6; index++)
		 {
			 if(array[index] % 2 == 0)
				 evenArray.add(array[index]);
			 else
				 oddArray.add(array[index]);
		 }
		 
		 System.out.println("Odd Array : " + oddArray + " \nEven Array: " + evenArray);
		 sc.close();
	}
}
