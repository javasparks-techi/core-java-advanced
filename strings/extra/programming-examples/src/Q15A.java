//15. Write a program to check the balance of brackets in the given string?
import java.util.Scanner;
import java.util.Arrays;
class Q15A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();  
		//abc(xyz{123}some)test  ==> yes
		//abc(xyz{123)some}test  ==> no
		//abc(xyz{123}sometest  ==> no
		String brackets = "([{<)]}>";
		String stack = "";
		char c1, lastCharInStack;
		for(int i = 0; i < s1.length(); i++)
		{
			c1 = s1.charAt(i);
			if(brackets.indexOf(c1) != -1)
			{
				stack = checkBalance(stack, c1);
			}
		}
		if(stack.length() == 0)
		{
			System.out.println("brackets are balanced in " + s1);
		}
		else
		{
			System.out.println("brackets are not balanced in " + s1);
		}
	}
	private static String checkBalance(String stack, char c1)
	{
		char lastCharInStack;
		if(c1 == '{' || c1 == '[' || c1 == '(' || c1 == '<')
		{
			stack += c1;
		}
		else if(c1 == '}' || c1 == ']' || c1 == ')' || c1 == '>')
		{
			lastCharInStack = stack.charAt(stack.length() - 1);
			if((lastCharInStack == '{' && c1 == '}') ||
				(lastCharInStack == '[' && c1 == ']') ||
				(lastCharInStack == '(' && c1 == ')') ||
				(lastCharInStack == '<' && c1 == '>'))
			{
				stack = stack.substring(0, stack.length() - 1);
			}
		}
		return stack;
	}
}
