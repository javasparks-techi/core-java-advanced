@interface A
{
	int version() default 1;
	String author() default "vijay";
	String platform() default "Windows";
}

@A(author="abc")
class M8
{
	@A(author="Manu")
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

