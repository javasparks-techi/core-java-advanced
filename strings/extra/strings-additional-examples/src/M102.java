//right rotate by one (word wise)
import java.util.Scanner;
class M102 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter a multiple words");
		String s1 = sc.nextLine();

		/*
		String[] words = s1.split(" ");
		String s2 = words[words.length - 1];
		for(int i = 0; i < words.length - 1; i++)
		{
			s2 += " " + words[i];
		}
		System.out.println(s2);
		*/

		s1 = s1.substring(s1.lastIndexOl(' ') + 1) + " " + s1.substring(0, s1.lastIndexOl(' '));
		System.out.println(s1);
	}
}





