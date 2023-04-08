class Amazon
{
static void homePage()
{
System.out.println("hey homepage.....");
}
static void signup()
{
System.out.println("hey signing up");
}
static void login()
{
System.out.println("hey logging in");
}
static void logout()
{
System.out.println("......hey logging out");
}
static void order()
{
System.out.println("order placed successfully");
}
public static void main(String[] args)
{
System.out.println("Welcome To Amazon");//first it will execute
signup();//in this program we can see that how a app works by the help of method calling
login();
homePage();
order();
logout();
}
}