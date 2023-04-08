class Home
{
	static String home_name="Jai Mahakal";
	int home_cost;
	String home_col;
	public static void main(String[] args)
	{
		System.out.println("Home name is "+home_name);
		Home H1=new Home();
		H1.home_col="Cream";
		System.out.println("The colour of home is "+H1.home_col);
		H1.home_col="Yellow";
		System.out.println("Changed to "+H1.home_col);
		Home H2=new Home();
		H2.home_cost=4500000;
		System.out.println(H2.home_cost);
	    H2.home_cost=10000000;
		System.out.println(H2.home_cost);
	}
}