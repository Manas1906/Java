class Sample1
{
	int x=10;
}
class Demo1 extends Sample1
{//int x=10;
	void cool()
	{
		System.out.println("hey its coooolllll......");
}
}
class Tester1 extends Demo1
{//int x=10;
/* void cool()
{
System.out.println("hey its coooollllll");
}*/
	void fo()
	{
		System.out.println("hey its foooo.....");
}
}
class Mainclass2
{
	public static void main(String[] args) 
	{
	Tester1 t1=new Tester1();
	System.out.println("example of multi level inheritance");
	System.out.println(t1.x);
	t1.fo();
	t1.cool();
	}
    }