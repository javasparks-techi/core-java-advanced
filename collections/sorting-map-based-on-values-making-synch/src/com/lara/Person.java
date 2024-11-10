package com.lara;

import java.util.Comparator;

public class Person 
{
	private String firstName;
	private String lastName;
	private Integer age;
	private Integer salary;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public static class SortBasedOnFirstName implements Comparator
	{
		@Override
		public int compare(Object o1, Object o2) 
		{
			Person p1 = (Person) o1;
			Person p2 = (Person) o2;
			return p1.getFirstName().compareTo(p2.getFirstName());
		}
	}
	
	
	public static class SortBasedOnLastName implements Comparator
	{
		@Override
		public int compare(Object o1, Object o2) 
		{
			Person p1 = (Person) o1;
			Person p2 = (Person) o2;
			return p1.getLastName().compareTo(p2.getLastName());
		}
	}
		
	
	public static class SortBasedOnAge implements Comparator
	{
		@Override
		public int compare(Object o1, Object o2) 
		{
			Person p1 = (Person) o1;
			Person p2 = (Person) o2;
			return p1.getAge().compareTo(p2.getAge());
		}
	}
			
	public static class SortBasedOnSalary implements Comparator
	{
		@Override
		public int compare(Object o1, Object o2) 
		{
			Person p1 = (Person) o1;
			Person p2 = (Person) o2;
			return p1.getSalary().compareTo(p2.getSalary());
		}
	}

	@Override
	public String toString() {
		return "Person [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getAge()="
				+ getAge() + ", getSalary()=" + getSalary() + "]";
	}
	
	
	
}








