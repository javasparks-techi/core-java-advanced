package com.lara.pack1;

import java.util.HashMap;

class Student
{
	private String firstName;
	private String lastName;
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

class Employee extends Student
{
	private String email;
	private String designation;
	public Employee(String firstName, String lastName, String email, String designation) {
		super(firstName, lastName);
		this.email = email;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [email=" + email + ", designation=" + designation + ", toString()=" + super.toString()	+ "]";
	}
}

public class M9 {
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		map1.put("emp1", new Employee("ramu", "b", "ramu@b.com", "Manager"));
		map1.put("emp2", new Employee("manu", "b", "ramu@c.com", "Director"));
		map1.put("emp3", new Employee("mohan", "b", "ramu@d.com", "CEO"));
		System.out.println(map1);
	}
}
