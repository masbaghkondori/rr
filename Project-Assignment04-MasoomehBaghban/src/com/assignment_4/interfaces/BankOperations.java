package com.assignment_4.interfaces;

/***
 * * @author Masoomeh
 * 
 * @version 1.0
 * 
 * 
 *          'BankOperation' is a interface with two methods which are
 *          implemented by BankAccount
 *
 */
public interface BankOperations {
	/***
	 * Empty body methods which will be implemented by BankAccount
	 * 
	 * @param amount
	 *            void methods to computing deposit and withdrawal of any
	 *            account
	 */
	public void withdrawMoney(double amount);

	public void depositMoney(double amount);

}
