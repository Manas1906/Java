class Cool2
{
	void disp(){
		System.out.println("disp....");
	}
}

class Dinga extends Cool2
{
	void tata(){
		System.out.println("Tata....");
	}
	int x=10;
}

class Mainclass8 
{
	public static void main(String[] args) 
	{
		Cool2 c = new Dinga();
		c.disp();
		Dinga d = (Dinga) c;
		d.tata();
		d.disp();
		System.out.println(d.x);
	}
}
