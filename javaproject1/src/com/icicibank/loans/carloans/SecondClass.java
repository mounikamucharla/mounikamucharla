package com.icicibank.loans.carloans;

public class SecondClass {
		int a = 10,b = 25,c;
	
		public void addition()
		{
			c =  a + b;
			System.out.println("sum of a and b is : " + c);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world ");
		SecondClass x = new SecondClass();
		x.addition();
		SecondClass y = new SecondClass();
		y.addition();
	}

}
