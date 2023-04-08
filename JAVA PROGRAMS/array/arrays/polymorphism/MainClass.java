class All_Shopping
{
	void order(){
		System.out.println("Orders....");
	}
}

class Myntra extends All_Shopping
{
	void order(){
		System.out.println("Order cloths");
	}
}

class Flipkart extends All_Shopping
{
	void order(){
		System.out.println("Order electronics");
	}
}

class Amazon extends All_Shopping
{
	void order(){
		System.out.println("Order groceries");
	}
}

class Stimulator
{
	static void animas(All_Shopping a1){
		a1.order();
	}
}

class MainClass  
{
	public static void main(String[] args) 
	{
		Myntra m1 = new Myntra();
		Flipkart f1 = new Flipkart();
		Amazon az1 = new Amazon();
		Stimulator.animas(m1);
		Stimulator.animas(f1);
		Stimulator.animas(az1);
	}
}
