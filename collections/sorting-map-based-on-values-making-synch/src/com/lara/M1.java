package com.lara;

import java.util.HashMap;
import java.util.Set;

public class M1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("hello", 201);
		map.put("abc", 20);
		map.put("xyz", 21);
		map.put("test", 1);
		map.put("btm", 25);
		map.put("java", 101);
		
		Set entries = map.entrySet();
		
		for(Object obj : entries)
		{
			System.out.println(obj);
		}	
		
	}
}
