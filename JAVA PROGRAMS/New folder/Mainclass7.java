abstract interface Demo
{
	void disp();
	void cool();
}
abstract class Sample implements Demo
{
	public void disp()
	{
		System.out.println("offered offered offered");
}
}
class tester extends Sample
{
	public void cool()
	{
		System.out.println("hii");
}
}
class Tester extends Sample
{
	public void cool()
	{
		System.out.println("hhiiii");
}
}
class Mainclass7 
{
	public static void main(String[] args) 
	{
		Tester t=new Tester();
		t.disp();
		t.cool();
	}
}