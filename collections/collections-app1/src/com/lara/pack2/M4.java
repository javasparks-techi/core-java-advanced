package com.lara.pack2;

import java.util.ArrayList;
import java.util.Iterator;

public class M4 {
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
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("----------");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}		
		System.out.println("----------");
		System.out.println(list);
	}
}
