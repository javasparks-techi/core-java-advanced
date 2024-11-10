package com.lara3;

public class M2 {
	public static void main(String[] args) {
		//Class.forName("");
		
		try
		{
			Class.forName("");
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
}
