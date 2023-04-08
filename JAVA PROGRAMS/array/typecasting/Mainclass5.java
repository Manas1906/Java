class Sample2
{
	void co(){
		System.out.println("Co.....");
	}
}

class Guleyluu extends Sample2
{
	void disp(){
		System.out.println("Disp.....");
	}
}

class Mainclass5 
{
	public static void main(String[] args) 
	{
		Sample2 s = new Guleyluu();
		s.co();
		Guleyluu g = (Guleyluu) s;
		g.disp();
		g.co();
	}
}
