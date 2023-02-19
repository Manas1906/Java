package oops;

class Sample1
{
	int a=5;
}
class Demo1 extends Sample1
{
	void cold()
	{
		System.out.println("hey its cold....");
	}
}
class Tester extends Demo1
{
	void warm() {
		System.out.println("hey its warm....");
	}
}
public class MutiLevelInheritance
{
	public static void main(String[] args) {
		Tester tester=new Tester();
		System.out.println(tester.a);
		tester.warm();
		tester.cold();
	}
}
/* A subclass inheriting the properties from its superclass in turn superclass
inheriting the properties from its superclass is called as multi level inheritance
*/