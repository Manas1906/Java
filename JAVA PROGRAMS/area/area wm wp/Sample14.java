class Trapezoid
{
static void area(int a,int b,int h)
	{
	 double res = 0.5*(a+b)*h;
		System.out.println(res);
}
}
class Sample14
{
	public static void main(String[] args)
	{
		Trapezoid.area(5,7,10);
}
}