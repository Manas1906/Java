class Triangle
{
	static void area()
	{
		static int b=5;
		static int h=6;
		static int result=b*h;
		System.out.println(result);
	}
}
class Sample
{
	public static void main(String[] args)
		Triangle.area();
		}
}