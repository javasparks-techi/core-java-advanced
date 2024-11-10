package com.lara;

import java.util.ArrayList;
import java.util.ListIterator;

public class M5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		ListIterator it = list.listIterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + ", ");
		}
	}
}
