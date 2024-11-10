package com.lara;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class M8 {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		//un safe to use in multi threaded env
		
		map = Collections.synchronizedMap(map);
		
		// safe to use in multi threaded env
		
	}
}
