package com.lara;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class M17 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		System.out.println(list1);

		ListIterator it = list1.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}		
	}
}
