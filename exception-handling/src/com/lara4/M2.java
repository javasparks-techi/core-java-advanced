package com.lara4;

public class M2 {
	public static void main(String[] args) {
		try
		{
			test();
		}
		catch(ClassNotFoundException ex)
		{
			
		}
	}
	static void test() throws ClassNotFoundException
	{
		Class.forName("");
	}
}
