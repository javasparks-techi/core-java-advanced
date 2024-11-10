package com.lara.pack2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
class ElementConsumer implements Consumer
{
	@Override
	public void accept(Object t)
	{
		System.out.println("consuming:" + t);
	}
}
public class M7 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(30);
		list.add(310);
		list.add(130);
		list.add(300);
		list.add(500);
		list.add(200);
		list.add(100);
		System.out.println(list);
		Iterator it = list.iterator();
		ElementConsumer action = new ElementConsumer();
		it.forEachRemaining(action);
	}
}
