class School
{
	static String School_name="St. Josephs";
	int School_strength;
	static String School_grade="A+";
	public static void main(String[] args)
	{
		System.out.println("School name is "+School_name);
		System.out.println("School garde is "+School_grade);
		School S1=new School();
			S1.School_strength=1500;
		System.out.println("The school strength is "+S1.School_strength);
		S1.School_strength=1400;
		System.out.println("It changed to "+S1.School_strength);
}
}