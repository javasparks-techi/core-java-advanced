package com.lara4;

import java.sql.DriverManager;
import java.sql.SQLException;

public class M10 {
	public static void main(String[] args){
		test1();
	}
	static void test1()
	{
		try
		{
			test2();
		}
		catch(ClassNotFoundException ex)
		{
			
		}
		catch(SQLException ex)
		{
			
		}
		catch(InterruptedException ex)
		{
			
		}
	}
	static void test2() throws ClassNotFoundException, SQLException, InterruptedException
	{
		Class.forName("");
		DriverManager.getConnection("");
		Thread.sleep(230);
	}
}
