package com.assignment_4.subclasses;

import java.util.ArrayList;
import com.assignment_4.superclasses.Human;
import com.assignment_4.superclasses.BankAccount;

/***
 * 
 * @author Masoomeh Baghban'
 * 
 * @version 1.0
 * 
 *          class BankCustomer is a subclass to class 'Human' and inherits it's
 *          properties. . attribute: customerAccounts an ArrayList<BankAccount>.
 *          a constructor that takes a String name and an int age.
 * 
 */
public class BankCustomer extends Human {
	BankAccount bankAccount = new BankAccount();
	private ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	public BankCustomer(String name, int age) {
		/***
		 * calls the constructor of the superclass.
		 */
		super(name, age);
		this.name = name;
		this.age = age;
	}

	/***
	 * it has getters and setters to the attribute customerAccounts.
	 * 
	 * @return
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	/***
	 * Method addAccount(BankAccount bankAccount),adds a bankAccount given as a
	 * parameter to the ArrayList<BankAccount> customerAccounts, i.e.
	 * 
	 * @param bankAccount
	 * @return
	 */
	public boolean addAccount(BankAccount bankAccount) {
		return customerAccounts.add(bankAccount);
	}

	/***
	 * MEthod depositToAccount(String accountNumber, double amount): that
	 * deposits an amount of money to an specific account.
	 * 
	 * @param accountNumber
	 * @param amount
	 */
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);

			}
		}

	}

	/***
	 * 
	 * withdrawFromAccount(String accountNumber, double amount): that withdraws
	 * an amount of money from an specific account.
	 * 
	 * @param accountNumber
	 * @param amount
	 */
	public void withdrawMoneyFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber) && amount > 0) {
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}

	}

	/***
	 * 
	 * • Method toString() prints the name and the age of a bankCustomer and the
	 * information of all accounts of that the customer.
	 * 
	 */
	@Override

	public String toString() {
		String result = "";
		result += "Customer name:" + name + ", age=" + age + "\n";
		for (int i = 0; i < customerAccounts.size(); i++) {
			result += customerAccounts.get(i).toString();
		}

		return result;
	}
}