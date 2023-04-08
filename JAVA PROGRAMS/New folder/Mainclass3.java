class Mainclass3
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to twitter ");
	    Twitter.send(1234);
		  Twitter.send( "Good Morning!");
		    Twitter.send(333,"Lucky no");
			  Twitter.send( "bye",98);
	}
}
class Twitter
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