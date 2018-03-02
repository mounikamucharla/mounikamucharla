package com.icicibank.loans.carloans;

public class ChildClass implements BasicInterface
{

	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.m1();
		
		// TODO Auto-generated method stub

	}
	
	@override
	public void m1()
	{
		System.out.println("hi i am overriden method in class childclass");
	}
}
