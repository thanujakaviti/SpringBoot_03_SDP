package in.jt;

public class DebitCardPayment implements CardPayment{
	public boolean payBill(double billAmount){
		System.out.println("Bill Paid By Using DebitCard & Amount is: "+billAmount);
		return true;
	}
}