package com.lara;

@interface Versions
{
	int[] allVersions();
}

@Versions(allVersions={12, 13})
public class C
{
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}


/*
 *  Method declarations must not have any parameters 
 *  and should not have throws clause. 
 *  Return types are restricted to primitives, String, 
 *  Class, enums, annotations, and arrays of the preceding types
 *  Return types should not be wrapper classes.
 */
