package com.lara.pack2;

import java.util.ArrayList;
import java.util.ListIterator;

public class M11 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(30);
		list.add(310);
		list.add(130);
		list.add(300);
		list.add(500);
		list.add(200);
		list.add(100);
		System.out.println(list);
		ListIterator it = list.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		list.add(555);
		System.out.println(list);
	}
}
