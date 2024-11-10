package com.lara;

import java.util.ArrayList;

public class M6 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		for(String s1 : args)
		{
			if(!list1.contains(s1))
			{
				list1.add(s1);
			}
		}
		System.out.println(list1);
	}
}
