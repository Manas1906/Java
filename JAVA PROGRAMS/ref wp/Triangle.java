class Triangle
{
	void area(int b,int h)
	{
		int res=b*h;
		System.out.println(res);
		return;
	}
	public static void main(String[] args)
	{
		Triangle T1=new Triangle();
		T1.area(5,7);
	}
}