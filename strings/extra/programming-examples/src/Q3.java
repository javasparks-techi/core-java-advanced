//3. Write a program to reverse a string first half separately and 
//2nd half separately?
import java.util.Scanner;
class Q3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();
		char[] x = s1.substring(0, s1.length()/2).toCharArray();
		char[] y = s1.substring(s1.length()/2, s1.length()).toCharArray();
		char temp;
		for(int i = 0; i < (x.length / 2); i++)
		{
			temp = x[i];
			x[i] = x[x.length - i  - 1];
			x[x.length - i  - 1] = temp;
		}
		for(int i = 0; i < (y.length / 2); i++)
		{
			temp = y[i];
			y[i] = y[y.length - i  - 1];
			y[y.length - i  - 1] = temp;
		}
		String s2 = new String(x) + new String(y);
		System.out.println("Given String:" + s1);
		System.out.println("Reversed String:" + s2);
	}
}
