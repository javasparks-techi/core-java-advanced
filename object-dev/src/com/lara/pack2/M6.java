package com.lara.pack2;
class G
{
	int i;
	G(int i)
	{
		this.i = i;
	}
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof G) && (i == ((G)obj).i);
	}
}
class H
{
	int j;
	G g1;
	
	@Override
	public boolean equals(Object obj) {
		boolean b1 = (obj instanceof H) &&
				     (j == ((H)obj).j) &&
	(g1 == null ? (((H)obj).g1 == null ? true : false) : (((H)obj).g1 == null ? false : g1.equals(((H)obj).g1)));
		return b1;
	}
}
public class M6 {
	public static void main(String[] args) {
		H h1 = new H();
		h1.j = 100;
		h1.g1 = new G(90);
		
		H h2 = new H();
		h2.j = 100;
		h2.g1 = new G(90);
		
		H h3 = new H();
		h3.j = 100;

		H h4 = new H();
		h4.j = 100;

		System.out.println(h1.equals(h2));
		System.out.println(h1.equals(h3));
		System.out.println(h1.equals(h4));
		System.out.println(h2.equals(h3));
		System.out.println(h2.equals(h4));
		System.out.println(h3.equals(h4));
	}
}















