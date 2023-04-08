class Circle
{
	void area(int r,double pi)
	{
		double res=pi*r*r;
		System.out.println(res);
		return;
	}
	public static void main(String[] args)
	{
		Circle C1=new Circle();
		C1.area(5,3.142);
	}
}