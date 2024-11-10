import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M78
{
	public static void main(String[] args) 
	{
		String src = "abc4xyz6hello";
		String exp = "^[a-z]*";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
