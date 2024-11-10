package com.lara4;

public class M5 {
	public static void main(String[] args) {
		test1();
	}
	static void test1() 
	{
		test2();
	}
	static void test2() 
	{
		int i = 10 / 0;
	}
}
