package oops;

class Hello{
	int x=10;
}
class Hi extends Hello{
	//int x=10; This will be imported implicitly from the 
	//superclass to the subclass
	void test()
	{
		System.out.println("This is testing");
	}
}
public class SingleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Hi h1=new Hi();
      h1.test();
      System.out.println(h1.x);
	}

}

/* A subclass inheriting the properties from only one superclass is
 *  called as single level inheritance.
 */