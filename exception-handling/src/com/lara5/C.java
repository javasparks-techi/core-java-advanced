package com.lara5;

public class C {
	public static void main(String[] args) {
		System.out.println(1);
		if(true)
		{
			throw new ArithmeticException("some message");
		}
		System.out.println(2);
	}
}
