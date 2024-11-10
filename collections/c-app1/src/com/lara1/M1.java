package com.lara1;

public class M1 {
	public static void main(String[] args) {
		System.out.println(1);
		if(true)
		{
			return;
		}
		try
		{
			System.out.println(2);
			System.out.println(3);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(4);
			System.out.println(5);
		}
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("end");
	}
}
