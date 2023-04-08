class Flipkart
{
	void display(){
		System.out.println("display all category....");
	}
}

class Mens extends Flipkart
{
	void display(){
		System.out.println("Display only mens category");
	}
}

class Womens extends Flipkart
{
	void display(){
		System.out.println("Display only womens category");
	}
}

class Children extends Flipkart
{
	void display(){
		System.out.println("Display only children category");
	}
}

class Stimulator2
{
	static void animas(Flipkart f){
		f.display();
	}
}

class MainClass2  
{
	public static void main(String[] args) 
	{
		Mens m1 = new Mens();
		Womens w1 = new Womens();
		Children c1 = new Children();
		Stimulator2.animas(m1);
		Stimulator2.animas(w1);
		Stimulator2.animas(c1);
	}
}
