interface Sample
{
	void cool();
	void disp();
}

class Demo implements Sample
{
	public void cool(){
		System.out.println("Hello Worldd");
	}

	public void disp(){
		System.out.println("Hello Worldd");
	}


}




class Mainclass 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		d.cool();
		d.disp();
	}
}
