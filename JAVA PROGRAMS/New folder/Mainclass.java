class Mainclass
{
	public static void main(String[] args)
	{
		System.out.println("hello world");
			main(10);
		main("hi",52);
		main(10,"hello");
	}
	public static void main(int b)
	{
		System.out.println("int b....");
	}
    public static void main(String a,int b)
	{
     System.out.println("String a,int b...");
	}
     public static void main(int b,String a)
	{
     System.out.println("int b,String a...");
	}
}