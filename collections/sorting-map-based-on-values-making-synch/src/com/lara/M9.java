package com.lara;

import java.util.ArrayList;

public class M9 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//un safe
		
		list = Util.synchronizedList(list);
		
		//safe
		
		list.add(90);
		list.add(90);
		list.add(90);
		Object obj = list.get(0);
		
		
	}
}
