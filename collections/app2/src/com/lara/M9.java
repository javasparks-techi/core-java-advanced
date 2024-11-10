package com.lara;

import java.util.PriorityQueue;

public class M9 {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(190);
		queue.add(1190);
		queue.add(910);
		queue.add(19011);
		queue.add(2190);
		queue.add(20);
		queue.add(120);
		queue.add(2190);
		queue.add(92);
		queue.add(1922);
		queue.add(1192222);		
		for(Object obj : queue)
		{
			System.out.println(obj);
		}
	}
}
