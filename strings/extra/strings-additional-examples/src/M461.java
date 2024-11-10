// char frequency
class M461 
{
	public static void main(String[] args) 
	{
		String s1 = "abcabchellohelloabctesttest";
		String s2 = "";
		System.out.println("initial string:" + s1);
		for(int i = 0; i < s1.length(); i++)
		{
			char c1 = s1.charAt(i);
			if(s2.indexOf(c1) == -1)
			{
				int count = 0;
				for(int j = 0; j < s1.length(); j++)
				{
					if(c1 == s1.charAt(j))
					{
						count ++;
					}
				}
				System.out.println(c1 + ":" + count);
				s2 = s2 + c1;
			}
		}
	}
}



class M462
{
	public static void main(String[] args) 
	{
		String s1 = "abcabchellohelloabctesttest";
		char[] x = s1.toCharArray();
		System.out.println("initial string:" + s1);
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0; j < x.length - i - 1; j ++)
			{
				if(x[j] > x[j + 1])
				{
					char temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
		int count = 1;
		for(int i = 0; i < x.length - 1; i++)
		{
			if(x[i] == x[i + 1])
			{
				count ++;
			}
			else
			{
				System.out.println(x[i] + ":" + count);
				count = 1;
			}
		}
		System.out.println(x[x.length - 1] + ":" + count);
	}
}
//remove white spaces
class M463
{
	public static void main(String[] args) 
	{
		String s1 = "abc abc hello hello abc test test";
		System.out.println("initial string:" + s1);
		int index = s1.indexOf(' ');
		while(index != -1)
		{
			s1 = s1.substring(0, index) + s1.substring(index + 1);
			index = s1.indexOf(' ');
		}
		System.out.println("final string:" + s1);
	}
}

//palindrom
class M464
{
	public static void main(String[] args) 
	{
		String s1 = "abcdcba";
		boolean flag = true;
		for(int i = 0; i < s1.length() / 2; i++)
		{
			if(s1.charAt(i) != s1.charAt(s1.length() - i - 1))
			{
				flag = false;
				break;
			}
		}
		System.out.println("palindrom status of " + s1 + " is " + flag);
	}
}