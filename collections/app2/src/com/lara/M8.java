package com.lara;

import java.util.PriorityQueue;

public class M8 {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(190);
		queue.add(1190);
		queue.add(1910);
		queue.add(20);
		queue.add(1901);
		queue.add(1290);
		queue.add(10);
		queue.add(15);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
