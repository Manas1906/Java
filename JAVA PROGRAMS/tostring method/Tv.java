class Tv
{
	String tv_brand;
	String tv_type;
	int tv_cost;
	School(String tv_brand,String tv_type,int tv_cost)
	{
		this.tv_brand=tv_brand;
		this.tv_type=tv_type;
		this.tv_cost=tv_cost;
	}
	public String toString()
	{
		return"TV name is "+this.tv_brand+"Tv type is "+this.tv_type"and the strength of school is "+this.tv_cost;
	}
	public static void main(String[] args) 
	{
		Tv T1=new Tv("St. Josephs ","A++ ",1567);
		System.out.println(S1.toString());
	}
}