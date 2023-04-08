class Demo1 
{
	int y=80;
	static void add(Demo1 d2) 
	{
		System.out.println(d2.y);
	}
	public static void main(String[] args)
	{
		Demo1 d1=new Demo1();
		System.out.println(d1.y);
		add(d1);
	}
}