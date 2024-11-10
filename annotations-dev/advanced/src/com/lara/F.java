package com.lara;

//three types of annotations
@interface MarkerAnnotation{}

@interface SingleValueAnnotation
{
	String message();
}

@interface MultiValueAnnotation
{
	String message();
	int test();
	double test1();
}

@MarkerAnnotation
@SingleValueAnnotation(message="abc")
@MultiValueAnnotation(message="xyz", test=12, test1=1.2)
public class F
{
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
