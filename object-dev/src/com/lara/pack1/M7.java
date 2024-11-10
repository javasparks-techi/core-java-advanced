package com.lara.pack1;
import java.util.ArrayList;

class Person
{
	private String firstName;
	private int age;
	Person(String firstName, int age)
	{
		this.firstName = firstName;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "[" + firstName + ", " + age + "]";
	}
}

public class M7 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("abc", 30));
		list.add(new Person("xyz", 310));
		list.add(new Person("vijay", 6630));
		System.out.println(list);
	}
}
