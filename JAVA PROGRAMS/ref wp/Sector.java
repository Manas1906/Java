class Sector
{
	void area(int r,double theta)
	{
		double res=0.5*r*r*theta;
		System.out.println(res);
		return;
	}
	public static void main(String[] args)
	{
	 Sector S1=new Sector();
		S1.area(5,0.166);
	}
}