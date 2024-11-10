package com.lara.pack2;

import java.util.ArrayList;
import java.util.ListIterator;

public class M10 {
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
		list.add(555);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(list);
	}
}
