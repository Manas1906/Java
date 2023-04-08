class Cola1
{
	int f = 10;
}

class Chungacha extends Cola1
{
	int d = 20;
}

class Mainclass6 
{
	public static void main(String[] args) 
	{
		Cola1 c = new Chungacha();
		System.out.println(c.f);
		Chungacha c1 = (Chungacha) c;
		System.out.println(c1.d);
		System.out.println(c1.f);
	}
}
