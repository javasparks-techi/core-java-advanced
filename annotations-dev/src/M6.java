@interface A
{
	int version() default 1;
	String author();
}

@A(author="abc")
class M6
{
	@A(author="abc", version=4)
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

