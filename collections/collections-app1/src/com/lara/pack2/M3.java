package com.lara.pack2;

import java.util.ArrayList;
import java.util.Iterator;

public class M3 {
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
		Object obj;
		while(it.hasNext())
		{
			obj = it.next();
			System.out.println(obj);
			if(obj.equals(300))
			{
				it.remove();
			}
		}
		System.out.println(list);
	}
}
