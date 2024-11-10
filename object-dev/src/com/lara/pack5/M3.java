package com.lara.pack5;

import java.util.ArrayList;
import java.util.Collections;

public class M3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("xyz");
		list.add("abc");
		list.add("test");
		list.add("java");
		list.add("btm");
		list.add("check");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
