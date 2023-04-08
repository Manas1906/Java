class Demo1
{
	double z= 10.0;
}

class Dumtaka extends Demo1
{
	int x=10;
}


class Mainclass4 
{
	public static void main(String[] args) 
	{
		Demo1 d = new Dumtaka();
		System.out.println(d.z);
		Dumtaka d1 = (Dumtaka) d;
		System.out.println(d1.x);
		System.out.println(d1.z);
	}
}
