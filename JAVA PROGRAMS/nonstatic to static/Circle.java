class Circle
{
	void area()
	{
	int r=5;
    double pi=3.142;
	double result=pi*r*r;
System.out.println(result);
return;
}
public static void main(String[] args)
{
	new Circle().area();
}
}