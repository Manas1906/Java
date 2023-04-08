class Railways
{
void book()
{
	System.out.println("Book the Ticket");
}
}
class IRCTC
{
	public static void main(String[] args)
	{
		Railways R1=new Railways();
	Customer1.needbooking(R1);
        Customer2.needbooking(R1);
}
}class Customer1{
static void needbooking(Railways R2){
	R2.book();
	}
}
	class Customer2
	{
    static void needbooking(Railways R3)
		{
		R3.book();
		}
	}