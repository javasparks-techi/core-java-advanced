package com.lara.pack1;

import java.util.Hashtable;

public class M10 {
	public static void main(String[] args) {
		Hashtable table = new Hashtable();
		table.put("abc", 3443);
		table.put(56, true);
		table.put("abc2", 'a');
		table.put(true, null);
		System.out.println(table);
	}
}
