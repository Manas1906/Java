class Demo10
{
	double z=10.0;
	int r = 10;
}

class Dumtaka3 extends Demo10
{
	int x=20;
}

class Mainclass11 
{
	public static void main(String[] args) 
	{
		Demo10 d = new Dumtaka3();
		System.out.println(d.z);
		System.out.println(d.r);
		Dumtaka3 d1 = (Dumtaka3) d;
		System.out.println(d1.x);
	}
}
