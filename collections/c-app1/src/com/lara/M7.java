package com.lara;

import java.util.ArrayList;
import java.util.Scanner;

public class M7 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("enter an element");
			String s1 = sc.next();		
			if(!list1.contains(s1))
			{
				list1.add(s1);
			}
			System.out.println("you want to add one more (y/ n)?");
		}while("y".equalsIgnoreCase(sc.next()));
		System.out.println(list1);
	}
}
