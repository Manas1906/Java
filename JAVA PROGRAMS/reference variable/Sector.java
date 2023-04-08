class Sector
{
	void area()
	{
		int r=6;
		double theta=0.166;
		double res=0.5*r*r*theta;
		System.out.println(res);
		return;
	}
	public static void main(String[] args)
	{
	 Sector S1=new Sector();
		S1.area();
	}
}