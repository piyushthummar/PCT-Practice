/**
 * 
 */
package com.piyush.beaverageSizing;

import java.util.Comparator;

/**
 * @author PIYUSH
 *
 */
public class CustomerInfo {
	private String name;
	private int age;
	private int heightFeet;
	private int heightInch;
	private String beverageType;
	private String cupSize;
	
	/**
	 * 
	 */
	public CustomerInfo() {
		super();
		this.name = null;
		this.age = 0;
		this.heightFeet = 0;
		this.heightInch = 0;
		this.beverageType = null;
		this.cupSize = null;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeightFeet() {
		return heightFeet;
	}
	public void setHeightFeet(int heightFeet) {
		this.heightFeet = heightFeet;
	}
	public int getHeightInch() {
		return heightInch;
	}
	public void setHeightInch(int heightInch) {
		this.heightInch = heightInch;
	}
	public String getBeverageType() {
		return beverageType;
	}
	public void setBeverageType(String beverageType) {
		this.beverageType = beverageType;
	}
	public String getCupSize() {
		return cupSize;
	}
	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}
	
	

	
	
}
