package com.lara.pack3;

import java.util.HashMap;
import java.util.TreeMap;

public class M1 
{
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("abc", 45);
		map.put("xyz", 405);
		map.put("pqr", 450);
		map.put("hello", 5);
		map.put("test", 4);
		map.put("java", 451);
		System.out.println(map);
		TreeMap map1 = new TreeMap();
		map1.putAll(map);
		System.out.println(map1);
	}
}
