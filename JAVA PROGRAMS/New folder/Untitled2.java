interface Animal
{
	void noise();
}
class Cat implements Animal
{
public void noise()
	{
	System.out.println("meow meow");
	}
}
class Dog implements Animal
{
public void noise()
	{
	System.out.println("bow bow");
	}
}







class Mainclass2 
{
	public static void main(String[] args) 
	{
		Cat C1=new Cat();
		Dog D1=new Dog();
		Snake S1=new Snake();
		Stimulator.ansim(C1);
		Stimulator.ansim(D1);
		Stimulator.ansim(S1);
	}
}
