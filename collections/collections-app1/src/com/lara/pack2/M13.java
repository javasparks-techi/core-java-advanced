package com.lara.pack2;

import java.util.ArrayList;
import java.util.ListIterator;

public class M13 {
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
		Object obj;
		while(it.hasNext())
		{
			obj = it.next();
			System.out.println(obj);
			if(obj.equals(300))
			{
				it.set(333);
			}
		}
		System.out.println(list);
	}
}
