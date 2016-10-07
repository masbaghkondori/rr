package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

/***
 * @author Masoomeh Class PersonalAccount is a subclass to BankAccount and
 *         extends its properties. no method a constructor without parameter,
 *         which generates unique AccountNumbers by using UUID
 */
public class PersonalAccount extends BankAccount {
	public PersonalAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Personal account");
	}
}
