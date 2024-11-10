package com.lara;

import java.util.ArrayList;

public class M10 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		System.out.println(list1);
		ArrayList list2 = new ArrayList();
		list2.add("abc");
		list2.add(90000);
		list2.add(9000);
		list2.add(9400);
		list2.add(3000);
		list2.addAll(1, list1);
		System.out.println(list1);
		System.out.println(list2);		
	}
}
