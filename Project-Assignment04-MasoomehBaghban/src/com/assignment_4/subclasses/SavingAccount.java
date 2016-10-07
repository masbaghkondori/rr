package com.assignment_4.subclasses;

import java.util.UUID;
/***
 * @author Masoomeh
 * Class SavingAccount is a subclass to BankAccount and extends its properties . 
 * no method
 * a constructor without parameter, which  generates unique AccountNumbers by using UUID 
 */
import com.assignment_4.superclasses.BankAccount;

/***
 * constructor to set amount to AccountNumber,Balance and AccountType
 */

public class SavingAccount extends BankAccount {
	public SavingAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Saving account");
	}
}
