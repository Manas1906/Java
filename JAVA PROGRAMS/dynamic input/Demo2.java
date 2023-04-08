import java.util.Scanner;
class Demo2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		for(int i=no;i%2==0;i++)
		{
			System.out.println(i);
	}
}
}