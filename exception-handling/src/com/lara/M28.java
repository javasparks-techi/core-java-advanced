package com.lara;

import java.util.Scanner;

public class M28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some thing");
		String s1 = sc.next();		
		try
		{
			System.out.println(1);
			int i = Integer.parseInt(s1);  //risky 1
			System.out.println(2);
			int k = i / (i - 9);  ////risky 2
			System.out.println(3);
			int[] elements = new int[10];
			int m = elements[i]; ////risky 3
			System.out.println(4);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(5);
		}
		catch(NumberFormatException ex1)
		{
			System.out.println(6);
		}
		catch(ArrayIndexOutOfBoundsException ex1)
		{
			System.out.println(7);
		}
		System.out.println(8);	
	}
}
