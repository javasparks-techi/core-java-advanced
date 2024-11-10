package com.lara;
@interface H
{
	String value();
}

@H("abc")
public class I
{
	public static void main(String[] args)
	{
		System.out.println("test");
	}
}
