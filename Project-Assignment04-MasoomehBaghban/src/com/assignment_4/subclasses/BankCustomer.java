package com.assignment_4.subclasses;

import java.util.ArrayList;
import java.util.Collection;
import com.assignment_4.superclasses.Human;
import com.assignment_4.superclasses.BankAccount;

/*�	The class BankCustomer: is a subclass to Human. It has one attribute customerAccounts,
 *  which is an ArrayList<BankAccount>. It has a constructor that takes a String name and an
 *   int age and calls the constructor of the superclass, i.e. super(name, age). Further, it 
 *   has getters and setters to the attribute customerAccounts. 
Moreover, it four methods: 
�	addAccount(BankAccount bankAccount), that simply adds a bankAccount given as a parameter
 to the ArrayList<BankAccount> customerAccounts, i.e. the attribute of the class.
�	depositToAccount(String accountNumber, double amount): that deposits an amount of money to
 an specific account. You can use the following implementation to it, if you will:
�	withdrawFromAccount(String accountNumber, double amount): that withdraws an amount of money
 from an specific account. The implementation looks like the implementation of 
 depositToAccount(String accountNumber, double amount). Pay attention just that now 
 you are withdrawing money from the account and not depositing!!
�	toString(): That prints the name and the age of a bankCustomer in one line and, after that, the 
information of all accounts that the customer. One account per line. As an example:
                   
When you have implemented your system, test it system with the following Main class:
You should get an output more or less like this:
Also, as a requirement, you should comment well all your code and generate a Javadoc for 
your project. On eclipse, on the top menu �Project-> generate javadoc�.
*/

public class BankCustomer extends Human {

	// invoking constructor ofsuperclass
	private ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();
	// constructor of the class BankCustomer calling superclass' attributes
	// public BankCustomer(String name, int age, ArrayList[][] customerAccounts)
	// {
	// public BankCustomer(ArrayList customerAccounts) {
	//
	//// super(name, age);
	// this.customerAccounts = customerAccounts(super.name,super.age);
	// }

	public BankCustomer(String name, int age, ArrayList<BankAccount> customerAccounts) {
		super(name, age);
		this.customerAccounts = customerAccounts;
	}

	public ArrayList getCustomerAccounts() {
		return customerAccounts;
	}

	public void setCustomerAccounts(ArrayList customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	/*
	 * � addAccount(BankAccount bankAccount), that simply adds a bankAccount
	 * given as a parameter to the ArrayList<BankAccount> customerAccounts, i.e.
	 * the attribute of the class.
	 */
	public void addAccount(BankAccount bankAccount) {
		customerAccounts.add(bankAccount);
	}
	/*
	 * depositToAccount(String accountNumber, double amount): that deposits an
	 * amount of money to an specific account. You can use the following
	 * implementation to it, if you will:
	 */

	public void depositToAccount(String accountNumber, double amount) {

		for (int i = 0; i < customerAccounts.size(); i++) {
			/*
			 * //since AccountNumber is a random number so //this instruction
			 * compares available numbers in arraylist with entered accountnumer
			 */

			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber))

			{
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}

	/*
	 * withdrawFromAccount(String accountNumber, double amount): that withdraws
	 * an amount of money from an specific account. The implementation looks
	 * like the implementation of depositToAccount(String accountNumber, double
	 * amount). Pay attention just that now you are withdrawing money from the
	 * account and not depositing!!
	 */
	public void withdrawFromAccount(String accountNumber, double amount){

		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)&&
					(customerAccounts.get(i).getBalance()>amount))
		

		{
				double b=customerAccounts.get(i).getBalance()-amount;
				 customerAccounts.get(i).setBalance(b);
		}
	}
	}

	/*
	 * toString(): That prints the name and the age of a bankCustomer in one
	 * line and, after that, the information of all accounts that the customer.
	 * One account per line. As an example:
	 * 
	 * When you have implemented your system, test it system with the following
	 * Main class: You should get an output more or less like this: Also, as a
	 * requirement, you should comment well all your code and generate a Javadoc
	 * for your project. On eclipse, on the top menu �Project-> generate
	 * javadoc�.
	 */
	
public String toString(String name,int age,ArrayList<BankAccount> customerAccount){
	 customerAccount.contains(customerAccount);

}}