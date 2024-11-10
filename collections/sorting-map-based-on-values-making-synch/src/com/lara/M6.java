package com.lara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M6 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(90);
		list.add(90);
		list.add(90);
		list.add(90);
		System.out.println(list);
		// not thread safe
		
		list = Collections.synchronizedList(list);
		
		//  thread safe		
		
		
		
		
		
	}
}
