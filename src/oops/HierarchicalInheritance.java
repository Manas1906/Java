package oops;

class Demo{
	int a=10;
}
class Demo2 extends Demo{
	void test() {
		System.out.println("Testing");
	}
}
	class Tester2 extends Demo2
	{
		void fo()
		{
			System.out.println("heyy its foo......");
		}
	}
public class HierarchicalInheritance 
{
public static void main(String[] args) 
{
	Demo2 demo2=new Demo2();
	System.out.println(demo2.a);
	demo2.test();
	
	Tester2 tester=new Tester2();
	System.out.println(tester.a);
	tester.fo();
	
}
}
