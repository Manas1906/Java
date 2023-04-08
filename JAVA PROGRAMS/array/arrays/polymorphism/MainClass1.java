class Myntra
{
	void display(){
		System.out.println("display all category....");
	}
}

class Mens extends Myntra
{
	void display(){
		System.out.println("Display only mens category");
	}
}

class Womens extends Myntra
{
	void display(){
		System.out.println("Display only womens category");
	}
}

class Children extends Myntra
{
	void display(){
		System.out.println("Display only children category");
	}
}

class Stimulator1
{
	static void animas(Myntra m){
		m.display();
	}
}

class MainClass1  
{
	public static void main(String[] args) 
	{
		Mens m1 = new Mens();
		Womens w1 = new Womens();
		Children c1 = new Children();
		Stimulator1.animas(m1);
		Stimulator1.animas(w1);
		Stimulator1.animas(c1);
	}
}
