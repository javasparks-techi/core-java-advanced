package com.lara4;

import java.sql.DriverManager;
import java.sql.SQLException;

public class M8 {
	public static void main(String[] args){
		test1();
	}
	static void test1()
	{
		test2();
	}
	static void test2()
	{
		try
		{
			Class.forName("");
			DriverManager.getConnection("");
			Thread.sleep(230);
		}
		catch(SQLException ex)
		{
			
		}
		catch(ClassNotFoundException ex)
		{
			
		}
		catch(InterruptedException ex)
		{
			
		}		
	}
}
