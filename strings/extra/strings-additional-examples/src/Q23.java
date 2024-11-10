// all permutations of anagrams for a given string
//23. Write a java program to find all permutations of a string?
import java.util.Scanner;
class Q23
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word");
		String s1 = sc.next();
		permutations(s1);
	}
	private static void permutations(String str)
	{ 
		permutations("", str); 
	}

	private static void permutations(String prefix, String str) 
	{
		int length = str.length();
		//1
		if (length == 0)
		{
			System.out.println(prefix); 
		}
		//2
		else 
		{
			for (int i = 0; i < length; i++)
			{
			permutations(prefix + str.charAt(i), 
			str.substring(0, i) + str.substring(i + 1, length));
			}
		}
	}
}
/*









permutations("", "abcd"); 
-------------------------
	permutations("a", "bcd"); 
	------------------------
		permutations("ab", "cd"); 
		-------------------------
			permutations("abc", "d");
			------------------------
				permutations("abcd", "");
			permutations("abd", "c");
			------------------------
				permutations("abdc", "");
		permutations("ac", "bd"); 
		------------------------
			permutations("acb", "d");
			------------------------
				permutations("acbd", "");
			permutations("acd", "b");
			------------------------
				permutations("acdb", "");
			
		permutations("ad", "bc"); 
		------------------------
			permutations("adb", "c");
			------------------------
				permutations("adbc", "");
			permutations("adc", "b");
			------------------------
				permutations("adcb", "");

	permutations("b", "acd"); 
	------------------------
		permutations("ba", "cd");
		permutations("bc", "ad");
		permutations("bd", "ac");
	permutations("c", "abd"); 
	-------------------------
		permutations("ca", "bd");
		permutations("cb", "ad");
		permutations("cd", "ab");


	permutations("d", "abc"); 
	-------------------------
		permutations("da", "bc");
		permutations("db", "ac");
		permutations("dc", "ab");









*/