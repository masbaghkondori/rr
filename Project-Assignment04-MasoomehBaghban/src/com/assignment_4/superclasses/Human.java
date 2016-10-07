package com.assignment_4.superclasses;

/***
 * @author The class Human is a superclass
 * 
 *         This class has two attributes: String 'name' and int 'age'. It has a
 *         constructor for all the attributes and getters and setters
 */

public class Human {
	BankAccount bc = new BankAccount();
	protected String name = "";
	protected int age = 0;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNAme() {
		return name;

	}

	public int getAge() {
		return age;
	}

}
