package com.lara;
import java.lang.annotation.Documented;

@Documented
@interface D
{
	
}

@interface D1
{
	
}

@D
@D1
public class E
{
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
