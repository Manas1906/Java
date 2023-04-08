class Amazon
{
	void display(){
		System.out.println("display all category....");
	}
}

class Mens extends Amazon
{
	void display(){
		System.out.println("Display only mens category");
	}
}

class Womens extends Amazon
{
	void display(){
		System.out.println("Display only womens category");
	}
}

class Children extends Amazon
{
	void display(){
		System.out.println("Display only children category");
	}
}

class Stimulator3
{
	static void animas(Amazon a){
		a.display();
	}
}

class MainClass3  
{
	public static void main(String[] args) 
	{
		Mens m1 = new Mens();
		Womens w1 = new Womens();
		Children c1 = new Children();
		Stimulator3.animas(m1);
		Stimulator3.animas(w1);
		Stimulator3.animas(c1);
	}
}
