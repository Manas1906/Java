class Car
{
	String car_modelname;
	String car_type;
	int car_cost;
	Car(String car_modelname,String car_type,int car_cost)
	{
		this.car_modelname=car_modelname;
        this.car_type=car_type;
		this.car_cost=car_cost;
	}
	public String toString()
	{
		return "car name is "+this.car_modelname+"car colour is "+this.car_type+"and the cost of mobile is "+this.car_cost;
	}
	public static void main(String[] args) 
	{
		Car C1=new Car("brezza ","petrol ",10000000);
		System.out.println(C1.toString());
	}
}