class Circle
{
	void area()
	{
		int r=7;
		double pi=3.142;
		double res=pi*r*r;
		System.out.println(res);
		return;
	}
	public static void main(String[] args)
	{
		Circle C1=new Circle();
		C1.area();
}
}