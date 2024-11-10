package com.lara;

@interface J
{
	int value();
}


@J(10)
public class K
{
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
