package com.lara;

import java.util.ArrayList;

public class M4 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(909);
		list1.add("abc");
		list1.add(909);
		list1.add(true);
		list1.add(909);
		list1.add('a');	
		System.out.println(list1);
		System.out.println(list1.contains("abc1"));
		System.out.println(list1.contains(90000));
	}
}
