class Tester 
{
	int r=10;
}

class Tista extends Tester
{
	void huliya(){
		System.out.println("Huliyaaa....");
	}
}


class Mainclass2 
{
	public static void main(String[] args) 
	{
		Tester t= new Tista();
		System.out.println(t.r);
		Tista t1 = (Tista) t;
		t1.huliya();
		System.out.println(t1.r);
	}
}
