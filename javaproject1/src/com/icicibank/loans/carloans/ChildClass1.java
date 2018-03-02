package com.icicibank.loans.carloans;

public class ChildClass1 extends ClassAbstract
{
	public static void main(String[] args) 
	{
		ChildClass c = new ChildClass();
		c.m1();
		c.m2();
		
	}
	 @Override
	 public void m2()
	 {
		 System.out.println("hi aim me overriden method in child class");
	 }
}
