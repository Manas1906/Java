class Employee
{
	String emp_id;
	int Sal;
	String emp_grade;
	public static void main(String[] args)
	{
		Employee E1=new Employee();
		E1.emp_id="ABC123";
		System.out.println(E1.emp_id);
		E1.emp_id="XYZ456";
		System.out.println(E1.emp_id);
		Employee E2=new Employee();
		E2.Sal=50000;
		System.out.println(E2.Sal);
	    E2.Sal=70000;
		System.out.println(E2.Sal);
		Employee E3=new Employee();
		E3.emp_grade="A+";
		System.out.println(E3.emp_grade);
		E3.emp_grade="A";
		System.out.println(E3.emp_grade);
	}
}