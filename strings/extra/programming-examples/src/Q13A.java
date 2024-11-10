//13. Write a program to check whether given string is a palindrome or not?
import java.util.Scanner;
import java.util.Arrays;
class Q13A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		boolean flag = true;
		for(int i = 0; i < s1.length() / 2; i++)
		{
			if(s1.charAt(i) != s1.charAt(s1.length() - 1 - i))
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(s1 + " is a palindrome");
		}
		else
		{
			System.out.println(s1 + " is not a palindrome");
		}
	}

}
