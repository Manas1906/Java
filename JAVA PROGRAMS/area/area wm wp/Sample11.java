class Circle
{
static void area(int r,double pi)
	{
	 double res = pi*r*r;
		System.out.println(res);
}
}
class Sample11
{
	public static void main(String[] args)
	{
		Circle.area(5,3.142);
}
}