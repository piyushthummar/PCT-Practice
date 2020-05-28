/**
 * 
 */
package com.piyush.beaverageSizing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author PIYUSH
 *
 */
public class AdvancedBeverageSizing {
	
	/**
	 * 
	 */
	public AdvancedBeverageSizing() {
		super();
	}
	
	public void sortedList(List<CustomerInfo> customerListDetails)
	{
		String secondSortKey = "";
		
		//CustomerInfo[] customerInfoArray = (CustomerInfo[]) customerListDetails.toArray();
		//Comparator 	
		Comparator<CustomerInfo> compareByName = new Comparator<CustomerInfo>() {
		    @Override
		    public int compare(CustomerInfo o1, CustomerInfo o2) {
		        return o1.getName().compareTo(o2.getName());
		    }
		};
		Collections.sort(customerListDetails, compareByName);
		System.out.println("\n***** SORTED BY NAME *****");
		for(CustomerInfo item : customerListDetails)
		{
			System.out.println(item.getName() + " " + item.getBeverageType() + " " + item.getCupSize() + " " + item.getAge() + " " + item.getHeightFeet() + " " + item.getHeightInch());
		}
		
		for(int index=0; index<customerListDetails.size() - 1; index++)
		{
			for(int index2 = index+1; index2<customerListDetails.size(); index2++)
			{
				//if(customerListDetails.get(index).getCupSize().compareToIgnoreCase(customerListDetails.get(index2).getCupSize());
			}
		}
		
	}
	
}
