class M1 
{
	public static void main(String[] args) 
	{
		int i = 10;
		Integer obj1 = new Integer(i);     //boxing
		Integer obj2 = Integer.valueOf(i); //boxing
		int j = obj1.intValue();	// un-boxing
		int k = obj2.intValue();	// un-boxing
		System.out.println("done");
	}
}














/*
1. 
primitive data type			wrapper class
-------------------         --------------
	byte						Byte
	short						Short
	int							Integer
	long						Long
	float						Float
	double						Double
	char						Character
	boolean						Boolean












2. java.lang













3. final












4. Serializable














5. Comparable












6. toString()















7. hashCode() and equals() 














8. usage
    1. boxing
	2. unboxing
	3. String to primitive (except char datatype)
	4. primitive to String











*/










