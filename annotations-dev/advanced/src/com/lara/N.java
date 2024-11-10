package com.lara;
@interface M
{
	String test();
}
@M("abc")
public class N
{
	public static void main(String[] args)
	{
		System.out.println("test");
	}
}

