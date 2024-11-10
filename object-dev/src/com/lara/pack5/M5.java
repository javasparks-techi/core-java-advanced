package com.lara.pack5;

import java.util.ArrayList;
import java.util.Collections;

public class M5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("xyz");
		list.add("abc");
		list.add("test");
		list.add("Java");
		list.add("btm");
		list.add("Check");
		list.add("6787");
		list.add("98778");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
