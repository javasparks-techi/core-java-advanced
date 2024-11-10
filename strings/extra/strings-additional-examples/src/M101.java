//checking balancing of brackets in the string
import java.util.Scanner;
class M101 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter a string");
		String s1 = sc.next();
		//Pls enter a string
		//(hello{test[123]xyz}done)
		//temp = "("
		String openBrackets = "([{<";
		String closeBrackets = ")]}>";
		String temp = "";
		char c1;
		for(int i = 0; i < s1.length(); i++)
		{
			c1 = s1.charAt(i);
			if(openBrackets.indexOf(c1) != -1)
			{
				temp += c1; //push
			}
			if(closeBrackets.indexOf(c1) != -1)
			{
				if((c1 == ')' && temp.charAt(temp.length() - 1) == '(') ||
				   (c1 == '}' && temp.charAt(temp.length() - 1) == '{') ||	
				   (c1 == ']' && temp.charAt(temp.length() - 1) == '[') ||	
				   (c1 == '>' && temp.charAt(temp.length() - 1) == '<'))
				{
					temp = temp.substring(0, temp.length() - 1);
				}
			}
		}
		if(temp.length() == 0)
		{
			System.out.println("brackets are balanced");
		}
		else
		{
			System.out.println("brackets are not balanced");
		}
	}
}
