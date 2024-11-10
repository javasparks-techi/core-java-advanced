package com.lara.pack1;

import java.util.HashSet;

class Address
{
	private String houseNo;
	private String streetName;
	Address(String houseNo, String streetName)
	{
		this.houseNo = houseNo;
		this.streetName = streetName;
	}
	
	@Override
	public String toString() {
		return houseNo + ", " + streetName;
	}	
}
class Author
{
	private String firstName;
	private String lastName;
	private Address address;
	public Author(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
}
public class M8 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new Author("abc", "xyz", new Address("123/N", "BTM")));
		set.add(new Author("vijay", "b", new Address("123/B", "BTM")));
		System.out.println(set);
	}
}



















