class Instagram
{
static void send(int no)
{
System.out.println("Sending no "+no);
}
static void send(String txt_msg)
{
System.out.println("Sending text message "+txt_msg);
}
static void send(int no,String txt_msg)
{
System.out.println("Sending no and text message "+no+" "+txt_msg);
}
static void send(String txt_msg,int no)
{
System.out.println("Sending text message and Sending no "+txt_msg+" "+no);
}
}
class Mainclass10
{
public static void main(String[] args)
{
Instagram.send(78542);
Instagram.send("Hello");
Instagram.send(78542,"hi");
Instagram.send("Bye",78542);
}
}