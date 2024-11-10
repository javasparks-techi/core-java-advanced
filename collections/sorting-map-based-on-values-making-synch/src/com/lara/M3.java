package com.lara;

import java.util.HashMap;
import java.util.TreeMap;

public class M3 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("hello", 201);
		map.put("abc", 20);
		map.put("xyz", 21);
		map.put("test", 1);
		map.put("btm", 25);
		map.put("java", 101);
		TreeMap map1 = new TreeMap();
		map1.putAll(map);
		System.out.println(map1);
	}
}
