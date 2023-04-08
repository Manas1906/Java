class Meesho
{
	void display(){
		System.out.println("display all category....");
	}
}

class Mens extends Meesho
{
	void display(){
		System.out.println("Display only mens category");
	}
}

class Womens extends Meesho
{
	void display(){
		System.out.println("Display only womens category");
	}
}

class Children extends Meesho
{
	void display(){
		System.out.println("Display only children category");
	}
}

class Stimulator4
{
	static void animas(Meesho m){
		m.display();
	}
}

class MainClass4  
{
	public static void main(String[] args) 
	{
		Mens m1 = new Mens();
		Womens w1 = new Womens();
		Children c1 = new Children();
		Stimulator4.animas(m1);
		Stimulator4.animas(w1);
		Stimulator4.animas(c1);
	}
}
