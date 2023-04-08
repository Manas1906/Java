import java.util.Scanner;
class Number2
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a= sc.nextInt();
		System.out.println("Enter the last number");
		int b=sc.nextInt();
		while(a<=b){
		System.out.println(a);
		a++;
		}
	}
}
