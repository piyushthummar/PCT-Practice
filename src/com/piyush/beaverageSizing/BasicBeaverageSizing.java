/**
 * 
 */
package com.piyush.beaverageSizing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author PIYUSH
 *
 */
public class BasicBeaverageSizing {

	/**
	 * 
	 */
	public BasicBeaverageSizing() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int limit[] = new int[3];
		int noOfCustomer;
		
		for(int index=0; index<3; index++)
			limit[index] = scanner.nextInt();

		noOfCustomer = scanner.nextInt();
		CustomerInfo customer = null;
		List<CustomerInfo> customerList = new ArrayList<>();
		
		for(int index = 0; index < noOfCustomer; index++)
		{
			customer = new CustomerInfo();
			
			customer.setName(scanner.next());
			customer.setAge(scanner.nextInt());
			customer.setHeightFeet(scanner.nextInt());
			customer.setHeightInch(scanner.nextInt());
			
			customerList.add(customer);
		}
		
		
		for(CustomerInfo item : customerList)
		{
			if(item.getAge() < 18)
			{
				item.setBeverageType("Water");
			}
			else
			{
				item.setBeverageType("Beer");
			}
			
			determineCupSize(item, limit);
			//System.out.println(item.getName() + " - " + cupSize);
		}
		
		for(CustomerInfo item : customerList)
		{
			System.out.println(item.getName() + " " + item.getBeverageType() + " " + item.getCupSize() + " " + item.getAge() + " " + item.getHeightFeet() + " " + item.getHeightInch());
		}
	}
	
	public static void determineCupSize(CustomerInfo customer, int[] limit)
	{
		int sizeOfBeverage = 0;
		
		if(customer.getHeightFeet() <= 5 && customer.getHeightFeet() != 0)
		{
			sizeOfBeverage = customer.getHeightFeet() * 10 + ( customer.getHeightInch() / 12 ) * 10;
		}else
		{
			sizeOfBeverage = 5 * 10 + (customer.getHeightFeet() - 5) * 8 + ( customer.getHeightInch() / 12 ) * 8;
		}
		
		if(sizeOfBeverage <= limit[0])
		{
			customer.setCupSize("ExtraSmall");
		}else if(sizeOfBeverage > limit[0] && sizeOfBeverage <= limit[1])
		{
			customer.setCupSize("Small");
		}else if(sizeOfBeverage > limit[1] && sizeOfBeverage <= limit[2])
		{
			customer.setCupSize("Medium");
		}else
		{
			customer.setCupSize("Large");
		}
	}
}
