package in.jt;

public class CreditCardPayment implements CardPayment{
	public boolean payBill(double billAmount){
		System.out.println("Bill Paid By Using CreditCard & Amount is: "+billAmount);
		return true;
	}
}