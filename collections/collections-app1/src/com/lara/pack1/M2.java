package com.lara.pack1;

import java.util.HashMap;

public class M2 {
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		map1.put(null, 23344);
		map1.put(345, "rty");
		map1.put(3.4, true);
		map1.put('a', null);
		map1.put(null, 456);
		System.out.println(map1);
	}
}
