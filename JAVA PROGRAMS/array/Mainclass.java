class Mainclass 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[6];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		System.out.println("**********************");
		System.out.println("index /t values");
		System.out.println("**********************");
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(i+"/t"+arr[i]);
		}
	}
}