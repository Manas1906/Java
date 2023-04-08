class Ellipse
{
	void area(int a,int b,double pi)
	{
		double res=pi*a*b;
		System.out.println(res);
		return;
	}
	public static void main(String[] args)
	{
	 Ellipse E1=new Ellipse();
		E1.area(5,7,3.142);
	}
}