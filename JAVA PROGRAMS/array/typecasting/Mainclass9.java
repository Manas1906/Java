class Tester3
{
	int r=10;
	void disp(){
		System.out.println("Disp....");
	}
}

class Tista1 extends Tester3
{
	void uliya(){
		System.out.println("Uliya.....");
	}
}

class Mainclass9 
{
	public static void main(String[] args) 
	{
		Tester3 t = new Tista1();
		System.out.println(t.r);
		t.disp();
		Tista1 t1 = (Tista1) t;
		t1.uliya();
		t1.disp();
	}
}
