class Sector
{
static void area(int r,double theta)
	{
	 double res = 0.5*r*r*theta;
		System.out.println(res);
}
}
class Sample16
{
	public static void main(String[] args)
	{
		Sector.area(3,0.166);
}
}