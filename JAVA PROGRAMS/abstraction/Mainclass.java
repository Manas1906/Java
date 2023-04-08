interface Transport
{
	void Via();
}
	class Metro implements Transport
	{
		public void Via()
		{
			System.out.println("Travel fastest");
		}
	}
	class Bus implements Transport
	{
		public void Via()
		{
			System.out.println("Travel faster");
		}
	}
    class Car implements Transport
	{
		public void Via()
		{
			System.out.println("Travel slower but with convinience");
		}
	}
    class Passenger
    {
		static void travel(Transport t1)
		{
			t1.Via();
    }
	}
class Mainclass
{
	public static void main(String[] args) 
	{
	  Metro M1=new Metro();
	  Bus B1=new Bus();
	  Car C1=new Car();
	  Passenger.travel(M1);
	  Passenger.travel(B1);
	  Passenger.travel(C1);
	}
}