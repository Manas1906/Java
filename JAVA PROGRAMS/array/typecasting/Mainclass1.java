class Sample
{
	void disp(){
		System.out.println("Disp....");
	}
}

class Ampules extends Sample
{
	void tata(){
		System.out.println("Tata.....");
	}
}
class Mainclass1 
{
	public static void main(String[] args) 
	{
		Sample s = new Ampules();
		s.disp();
		Ampules a = (Ampules) s;
		a.tata();
		a.disp();
	}
}
