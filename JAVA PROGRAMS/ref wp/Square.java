class Square
{
	void area(int a)
	{
		int res=a*a;
		System.out.println(res);
		return;
	}
	public static void main(String[] args)
	{
		Square S1=new Square();
		S1.area(7);
	}
}