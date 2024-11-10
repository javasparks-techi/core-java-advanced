//27. How to search a word inside a string?
import java.util.Scanner;
class Q27 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = sc.next();
		System.out.println("Enter second string");
		String s2 = sc.next();
		boolean isAvailable = false;
		int index = -1;
		char c1, c2;
		int j = 0, count = 0;
		for(int i = 0; i < s2.length(); i++)
		{
			c1 = s2.charAt(i);
			for(; j < s1.length(); j++)
			{
				c2 = s1.charAt(j);
				if(!isAvailable && c1 == c2)
				{
					isAvailable = true;
					index = j;
					count ++;
					j++;
					break;
				}
				if(isAvailable)
				{
					j++;
					if(c1 == c2)
					{
						count ++;
						break;
					}
					else
					{
						i = 0;
						isAvailable = false;
						count = 0;
						break;
					}
				}
			}
		}
		if(count == s2.length())
		{
			System.out.println(s2 + " is available @ " + index);
		}
		else
		{
			System.out.println(s2 + " is not available");
		}
	}
}
