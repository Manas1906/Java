class Cool
{
	void add(){
		System.out.println("Add.....");
	}
}

class Goolata extends Cool
{
	void disp(){
		System.out.println("Disp.....");
	}
}

class Mainclass3 
{
	public static void main(String[] args) 
	{
		Cool c = new Goolata();
		c.add();
		Goolata g = (Goolata) c;
		g.disp();
		g.add();
	}
}
