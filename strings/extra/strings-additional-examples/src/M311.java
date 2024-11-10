/*
	Find out length of a string without length method
*/
class M311 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello"; 
		System.out.println(s1.toCharArray().length);
		System.out.println((s1 + "r").lastIndexOf('r'));
		System.out.println((s1);
	}
}




/*
	right rotate by one
*/
class M312 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello"; 
		String s2 = (s1.charAt(s1.length() - 1) + s1).
			substring(0, s1.length());
		System.out.println(s1);
		System.out.println(s2);
	}
}

/*
	left rotate by one
*/
class M313 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello"; 
	String s2 = 
		(s1 + s1.charAt(0)).substring(1, s1.length() + 1);
		System.out.println(s1);
		System.out.println(s2);
	}
}
/*
	word count
*/
class M314
{
	public static void main(String[] args) 
	{
	String s1 = "Hello Test Java Lara Check Bangalore 123"; 
		int i = s1.indexOf(' ');
		int spaces = 0;
		while(i != -1)
		{
			spaces ++;
			i = s1.indexOf(' ', i + 1);
		}
		int count = spaces + 1;
		System.out.println(s1);
		System.out.println(count);
	}
}

/*
	left shift by one word
*/
class M315
{
	public static void main(String[] args) 
	{
	String s1 = "Hello Test Java Lara Check Bangalore 123"; 
	String firstWord = s1.substring(0, s1.indexOf(' '));
	String s2 = 
		(s1 + " " + firstWord).substring(s1.indexOf(' ') + 1);
		System.out.println(s1);
		System.out.println(s2);
	}
}


/*
	right shift by one word
*/
class M316
{
	public static void main(String[] args) 
	{
	String s1 = "Hello Test Java Lara Check Bangalore 123"; 
	String lastWord = s1.substring(s1.lastIndexOf(' ') + 1);
	String s2 = lastWord + " " + s1;
	s2 = s2.substring(0, s2.lastIndexOf(' '));
	System.out.println(s1);
	System.out.println(s2);
	}
}






