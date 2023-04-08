class Mobile 
{
	String mobile_colour;
	static String mobile_name="Samsung galaxy S22 Ultra";
	static int mobile_cost=100000;
	public static void main(String[] args) 
	{
		System.out.println("Mobile name is "+mobile_name);
		System.out.println("Mobile cost is "+mobile_cost);
		Mobile Std1=new Mobile();
		Std1.mobile_colour= "Mobile colour is green";
		System.out.println(Std1.mobile_colour);
	}
}