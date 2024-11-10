package com.lara.pack2;

import java.util.Enumeration;
import java.util.Vector;

public class M15 {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add("abc");
		v1.add(5.6);
		v1.add(121);
		v1.add(true);
		v1.add('a');		
		Enumeration enum1 = v1.elements();
		while(enum1.hasMoreElements())
		{
			System.out.println(enum1.nextElement());
		}
	}
}
