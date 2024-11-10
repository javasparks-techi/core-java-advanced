package pack1;
import pack1.pack11.M;
import pack2.N;
import pack2.pack22.O;
class L 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert false;
		System.out.println(2);
		M.test2();
		System.out.println(3);
		O.test4();
		System.out.println(4);
		N.test3();
		System.out.println(5);
	}
}




/*
 1. -ea:pack2... 
	//enable in pack2 and sub packages of pack2 (pack2.pack22) members

2. -ea:pack2.N 
	//enable only in the N class

3. -ea -da:pack1... 
	//enable in pack2 and sub packages of pack2 (pack2.pack22) members

4. -ea -da:pack1... -da:pack2.pack22.O
	//enable only in the N class
  
  */























