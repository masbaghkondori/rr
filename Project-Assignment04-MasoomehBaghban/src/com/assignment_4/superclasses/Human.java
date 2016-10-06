package com.assignment_4.superclasses;

import com.assignment_4.interfaces.BankOperations;

/*�	The class Human: has two attributes; String name and int age. It has a constructor that take all the attributes and 
getters and setters
. The class Human is a seuperclass*/
public abstract class Human implements BankOperations{
	private String name="";
	private int age=0;
	public Human(String name,int age){
		this.name=name;
		this.age=age;
	}
	
public void setName(String name){
	this.name=name;
}
public void setAge(int age){
	this.age=age;
}
public String getNAme(){
	return name;
	
}
public int getAge(){
return age;
}

@Override
public void withdrawMoney(double amount) {
	// TODO Auto-generated method stub
	
}

@Override
public void depositMoney(double amount) {
	// TODO Auto-generated method stub
	
}
}
