class Laptop
{
	static String Lap_brand="HP";
	int Lap_cost;
	String Lap_name;
	public static void main(String[] args)
	{
		System.out.println("Lap_brand");
		Laptop L1=new Laptop();
		L1.Lap_cost=40000;
		System.out.println("The cost of laptop is "+L1.Lap_cost);
		L1.Lap_cost=80000;
		System.out.println(L1.Lap_cost);
		Laptop L2=new Laptop();
		L2.Lap_name="Pavilion";
		System.out.println(L2.Lap_name);
	    L2.Lap_name="Omen";
		System.out.println(L2.Lap_name);
	}
}
