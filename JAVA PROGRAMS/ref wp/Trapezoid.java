class Trapezoid
{
	void area(int a,int b,int h,double pi)
	{
		double res=pi*(a+b)*h;
		System.out.println(res);
		return;
	}
	public static void main(String[] args)
	{
	 Trapezoid T1=new Trapezoid();
		T1.area(5,7,10,3.142);
	}
}