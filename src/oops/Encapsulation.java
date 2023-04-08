package oops;

public class Encapsulation {
	public static void main(String[] args) {
		ICICI i=new ICICI();
		System.out.println(i.getPwd());
		i.setPwd(143);
		System.out.println(i.getPwd());
	}
	}
	class ICICI
	{
		private int pwd=1234;
		public int getPwd() {
			return pwd;
		}
		public void setPwd(int Pwd) {
			this.pwd=pwd;
		}

}
