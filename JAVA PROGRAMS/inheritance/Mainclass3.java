class Sample2
{
	int a=10;
}
class Demo2 extends Sample2
{//int a=10;
	void test()
	{
		System.out.println("hey its test......");
}
}
class Tester2 extends Sample2
{//int a=10;
	void fo()
	{
		System.out.println("hey its foooo.....");
}
}
class Mainclass3
{
	public static void main(String[] args) 
	{
		System.out.println("********Demo2*********");
		Demo2 d2=new Demo2();
		System.out.println(d2.a);
		d2.test();
		System.out.println("********Tester2*********");
		Tester2 t2=new Tester2();
		System.out.println(t2.a);
		t2.fo();
	}
}