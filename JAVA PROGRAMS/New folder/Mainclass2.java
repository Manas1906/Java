class Mainclass2
{
	public static void main(String[] args)
	{
	    Whatsapp.send( 123);
		  Whatsapp.send( "hi");
		    Whatsapp.send( 126,"hi");
			  Whatsapp.send( "hi",127);
	}
}
class Whatsapp
{
	static void send(int no)
	{
		System.out.println("Sending no "+no);
	}
    static void send(String textmsg)
	{
     System.out.println("Sending textmsg "+textmsg);
	}
    static void send(int no,String textmsg)
	{
     System.out.println("Sending no & textmsg "+no+" "+textmsg);
	}
    static void send(String textmsg,int no)
		{
		System.out.println("Sending textmsg & no "+textmsg+" "+no);
		}
}