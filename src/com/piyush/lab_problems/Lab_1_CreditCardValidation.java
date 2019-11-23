package com.piyush.lab_problems;

import java.util.Scanner;

public class Lab_1_CreditCardValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String creditCardNo = sc.next();
		int sum = 0;
		if(creditCardNo.length() < 20) {	
			int[] digitsOfCreditCard = new int[creditCardNo.length()];
			int index=0;
			
			//convert to int
			for(char ch : creditCardNo.toCharArray())
			{
				digitsOfCreditCard[index] = Character.getNumericValue(ch);
				index++;
			}
			
			for(index = creditCardNo.length() - 2; index >= 0; )
			{
				int tempDigit = digitsOfCreditCard[index] * 2;
				int tempSum = 0;
				while(tempDigit > 0)
				{
					tempSum += (tempDigit % 10);
					tempDigit = tempDigit / 10;
				}
				digitsOfCreditCard[index] = tempSum;
				index -= 2;
			}
			
			for(index = 0; index < creditCardNo.length(); index++) {
				sum += digitsOfCreditCard[index];
			}
			if(sum % 10 == 0) {
				System.out.println("VALID");
			} else {
				int correctCheckDigit = 0;
				int lastDigit = digitsOfCreditCard[creditCardNo.length() - 1];
				
				//logic to count correct check digit
				sum = sum - lastDigit;
				sum = sum * 9;
				correctCheckDigit = sum % 10;
				
				System.out.println("INVALID " + correctCheckDigit);
			}
		}
	}

}
