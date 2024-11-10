package com.lara;

public class M35 {
	public static void main(String[] args) {
		System.out.println(1);
		if(true)
		{
			return;
		}
		try
		{
			System.out.println(2);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(3);
		}
		finally
		{
			System.out.println(4);
		}
		System.out.println(5);
	}
}
