class Rectangle
{
	void area(int l,int b)
	{
		int res=l*b;
		System.out.println(res);
		return;
	}
	public static void main(String[] args)
	{
	 Rectangle R1=new Rectangle();
		R1.area(10,11);
	}
}