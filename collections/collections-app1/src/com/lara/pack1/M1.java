package com.lara.pack1;

import java.util.HashMap;

public class M1 {
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		map1.put("key1", 23344);
		map1.put(345, "rty");
		map1.put(3.4, true);
		map1.put('a', false);
		System.out.println(map1);
	}
}
