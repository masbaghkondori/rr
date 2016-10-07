package com.assignment_4.superclasses;
/***
 *  * @author Masoomeh
 * *
 'BankAccount' represents a class to implement  the interface 'BankOperation'.
*This class is a superclass and has 
*-three attributes String auccountNumber, String accountType and double balance.
*-getter and setter to the attributes.
*-a constructor without parameter
*- two subclasses 'PersonalAccount and SavingAccount.
*-implementation of the methods of the interface 'BankOperation'
*
*/
import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;
public  class BankAccount implements BankOperations{
	/**
	 *  Declaring the attributes	
	 */
	protected String accountNumber = "";
	protected double balance = 0;
	protected String accountType = "";
/*** 
 * generating constructor of the 'class BankAccount'
 */
	public BankAccount() {	
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType = "Bank account";
	}	
	/***
	 * getter and setter
	 * setter methods: assigning values to the attributes
	 * @return
	 */
	

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/***
	 *    getter methods: pass values of attributes to other methods.   

	 * @return
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountType() {
		return accountType;
	}

/***
 * Method withdrawMoney to compute the balance after withdrawing
 * @param double amount
 */
	
	public void withdrawMoney(double amount) {
		if (amount>=0){
			setBalance(this.balance - amount);
		}else{
			System.out.println("You can not withdraw a negative value!");
		}
				
	}
/***
 * Method depositMoney to compute the balance after depositing
 * @param double amount
*/
	public void depositMoney(double amount) {
		if (amount>=0){
			setBalance(getBalance() + amount);
		}else{
			System.out.println("You can not deposit a negative value!");
		}
		
	}
/***
 * overriding method toString in order to send the information in customer's 'BAnkAccount' about a specific BankAccount
 * no parameter
 * @return    A string
 */
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", accountType=" + accountType+"]\n";
	}	
		

}

