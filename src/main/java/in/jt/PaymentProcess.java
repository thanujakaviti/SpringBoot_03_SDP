package in.jt;
public class PaymentProcess{

	public static boolean doPayment(CardPayment cp, double amount){
		//CardPayment cp = cc;
		//CardPayment cp = new CreditCardPayment;
		//CardPayment cp = new DebitCardPayment;
		//CardPayment cp = new ZetaCardPayment;
		//CardPayment cp = new AmexCardPayment;
		return cp.payBill(amount);
	} 
}