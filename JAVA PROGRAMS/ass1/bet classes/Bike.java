class Bike
{
	static String Bike_brand="BMW";
	int Bike_cost;
	String Bike_colour;
	public static void main(String[] args)
	{
		System.out.println("Bike_brand");
		Bike B1=new Bike();
		B1.Bike_cost=500000;
		System.out.println(B1.Bike_cost);
		B1.Bike_cost=2000000;
		System.out.println(B1.Bike_cost);
		Bike B2=new Bike();
		B2.Bike_colour="Blue";
		System.out.println(B2.Bike_colour);
	}
}
