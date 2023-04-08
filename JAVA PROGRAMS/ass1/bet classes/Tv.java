class Tv
{
	static String tv_brand="Samsung";
	int tv_cost;
	String tv_type;
	public static void main(String[] args)
	{
		System.out.println("Tv brand name is "+tv_brand);
		Tv T1=new Tv();
		T1.tv_cost=50000;
		System.out.println("The cost of tv is "+tv_cost);
		T1.tv_cost=100000;
		System.out.println("Changed to "+T1.tv_cost);
		Tv T2=new Tv();
		T2.tv_type="Qled";
		System.out.println(T2.tv_type);
	    T2.tv_type="Oled";
		System.out.println(T2.tv_type);
	}
}