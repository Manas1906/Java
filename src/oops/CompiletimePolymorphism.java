package oops;

class PhonePe{
	void pay(int no) {
		System.out.println("Pay with mobile no");
	}
	void pay(String UpiId) {
		System.out.println("Pay with upi id");
	}
	void pay(int no, String QrCode) {
		System.out.println("Pay with either mobile no or Qr code");
	}
	void pay(String UpiId, int no) {
		System.out.println("Pay with upi id or upi no");
	}
}

public class CompiletimePolymorphism 
{
public static void main(String[] args) 
{
	PhonePe P1=new PhonePe();
	P1.pay(1234567890);
	P1.pay("1234567890@upi");
	P1.pay(1234567890, "Scan the Qr code");
	P1.pay("1234567890@upi", 123456789);
}
}
