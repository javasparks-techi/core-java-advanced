package com.lara;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class M7 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		//not a thread safed one
		
		set = Collections.synchronizedSet(set);
		
		//thread safed one
		
		
	}
}
