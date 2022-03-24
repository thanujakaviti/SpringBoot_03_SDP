package in.jt;

public class ZetaCardPayment implements CardPayment{
	public boolean payBill(double billAmount){
		System.out.println("Bill Paid By Using ZetaCard & Amount is: "+billAmount);
		return true;
	}
}