class Sample21
{
	void co(){
		System.out.println("Co.....");
	}
	int r=10;
}

class Hahaha extends Sample21
{
	void disp(){
		System.out.println("Disp....");
	}
}

class Mainclass12 
{
	public static void main(String[] args) 
	{
		Sample21 s = new Hahaha();
		s.co();
		System.out.println(s.r);
		Hahaha h = (Hahaha) s;
		h.disp();
		h.co();
	}
}
