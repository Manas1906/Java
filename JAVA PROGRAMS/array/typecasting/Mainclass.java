class Demo
{
	int x=20;
}

class PemoCha extends Demo
{
	void ho(){
		System.out.println("Ho....");
	}
}



class Mainclass
{
	public static void main(String[] args) 
	{
		Demo d =  new PemoCha();
		System.out.println(d.x);
		PemoCha p = (PemoCha) d;
		System.out.println(p.x);
		p.ho();
	}
}
