
public class Demo3 extends Object {
String emp_name="rajesh";
double sal=55555.55;
public String toString()
{
return "employee name is"+emp_name+"and Salary is"+sal;
}
public static void main(String[] args) {
	Demo3 d=new Demo3();
	System.out.println(d.toString());
}
}