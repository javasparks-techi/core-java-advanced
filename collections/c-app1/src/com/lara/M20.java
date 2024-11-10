package com.lara;

import java.util.ArrayList;

public class M20 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		System.out.println(list1);
		list1.clear();
		System.out.println(list1);
		System.out.println(list1.isEmpty());	
	}
}
