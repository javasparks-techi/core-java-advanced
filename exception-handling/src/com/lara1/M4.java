package com.lara1;

public class M4 {
	int test1()
	{
		try
		{
			//some statements
		}
		catch(ArithmeticException ex)
		{
			//some statements
		}
		finally
		{
			//some statments
		}
		return 10;
	}
	
	int test2()
	{
		try
		{
			//some statements
			return 20;
		}
		catch(ArithmeticException ex)
		{
			//some statements
		}
		finally
		{
			//some statments
		}
		return 10;
	}
	
	int test3()
	{
		try
		{
			//some statements			
		}
		catch(ArithmeticException ex)
		{
			//some statements
			return 20;
		}
		finally
		{
			//some statments
		}
		return 10;
	}
	
	int test4()
	{
		try
		{
			//some statements			
		}
		catch(ArithmeticException ex)
		{
			//some statements			
		}
		finally
		{
			//some statments
			return 20;
		}
	}
	
//	int test5()
//	{
//		try
//		{
//			//some statements			
//		}
//		catch(ArithmeticException ex)
//		{
//			//some statements			
//		}
//		finally
//		{
//			//some statments
//			return 20;
//		}
//		return 500;
//	}
	
//	int test6()
//	{
//		try
//		{
//			//some statements
//			return 20;
//		}
//		catch(ArithmeticException ex)
//		{
//			//some statements
//			return 10;
//		}
//		finally
//		{
//			//some statments			
//		}
//		return 500;
//	}
	
}
