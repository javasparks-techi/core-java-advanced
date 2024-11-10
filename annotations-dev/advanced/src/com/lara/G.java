package com.lara;
import java.lang.annotation.Repeatable;



@interface AllAuthors
{
	Author[] value();   // method name should be value
}

@Repeatable(value = AllAuthors.class)    //  JDK1.8
@interface Author
{
	String name();
}


@Author(name="Pavan")
@Author(name="Naresh")
@Author(name="Naveen")
public class G
{
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
//Repeatable introduced in JDK1.8


