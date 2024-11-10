//28. How to remove html tags from a string?
import java.util.Scanner;
class Q28 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = sc.nextLine();
		String s2 = s1;
		int startIndex = -1, endIndex;
		char startChar = '<', endChar = '>';
		char currentChar;
		for(int i = 0; i < s2.length(); i++)
		{
			currentChar = s2.charAt(i);
			if(currentChar == startChar)
			{
				startIndex = i;
			}
			if(currentChar == endChar && startIndex != -1)
			{
				endIndex = i;
				s2 = s2.substring(0, startIndex) + 
					 s2.substring(endIndex + 1);
				startIndex = -1;
				i = i - (endIndex - startIndex);
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}
