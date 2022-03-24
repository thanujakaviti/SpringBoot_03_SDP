package in.jt;

public class AmexCardPayment implements CardPayment{
	public boolean payBill(double billAmount){
		System.out.println("Bill Paid By Using AMEXCARD & Amount is: "+billAmount);
		return true;
	}
}