class Cool4
{
	void add(){
		System.out.println("Add.....");
	}
}

class Goolata2 extends Cool4
{
	int r=10;
	void disp(){
		System.out.println("Disp.....");
	}
}
class Mainclass10 
{
	public static void main(String[] args) 
	{
		Cool4 c = new Goolata2();
		c.add();
		Goolata2 g = (Goolata2) c;
		g.disp();
		System.out.println(g.r);
		g.add();
	}
}
