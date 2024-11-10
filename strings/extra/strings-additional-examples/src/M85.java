import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M84
{
	public static void main(String[] args) 
	{
		String src = "abc@hello.s.com";
		//String src = "abc@gmail.co.in";
		//String src = "abc@gmail.com";
		//String src = "abc@something.in";
		//String src = "abc@abc.com";
		//String src = "abc@hello.s.7com";
		//String src = "abc@hello.s.org";

		String exp = "[a-zA-Z_]+@([a-zA-Z0-9_]+\\.)*[a-zA-Z0-9_]+\\.[a-z]{2,}$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
