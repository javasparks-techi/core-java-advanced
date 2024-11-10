package com.lara5;

import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		System.out.println(1);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		if(age <= 0)
		{
			throw new AgeIsNegativeException("age should be greater than 0");
		}
		//continue
		System.out.println(2);
	}
}
