package oops;
/* Definition - Hiding the complexity of the system and exposing only the
 *  required functionality to the end user is called as abstraction.
 * */
interface Transport
{
	void travel();
}
	class Metro implements Transport
	{
		public void travel()
		{
			System.out.println("Travel fastest");
		}
	}
	class Bus implements Transport
	{
		public void travel()
		{
			System.out.println("Travel faster");
		}
	}
    class Car implements Transport
	{
		public void travel()
		{
			System.out.println("Travel slower but with convinience");
		}
	}
    class Passenger
    {
		static void Via(Transport t1)  //create a reference variable for interface
	//	and provide the implementation in the subclass
		{
			t1.travel();
    }
	}
class Abstraction
{
	public static void main(String[] args) 
	{
	  Metro M1=new Metro();
	  Bus B1=new Bus();
	  Car C1=new Car();
	  
	  Passenger.Via(M1);   //
	  Passenger.Via(B1);
	  Passenger.Via(C1);
	}
}