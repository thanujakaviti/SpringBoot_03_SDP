package in.jt;

import java.util.Scanner;
import java.util.Scanner;
public class EndUserPaymentProcess{
	public static void main(String[] s){
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Card Details");
		String cardType = scan.next();	//creditcard debitcard
		
		System.out.println("Enter Your Bill Amount");
		double amount = scan.nextDouble(); //2000 3000
		
		
		if("CREDITCARD".equalsIgnoreCase(cardType)){
			CreditCardPayment cc = new CreditCardPayment();
			PaymentProcess.doPayment(cc, amount);
		}
		else if("DEBITCARD".equalsIgnoreCase(cardType)){
			DebitCardPayment dc = new DebitCardPayment();
			PaymentProcess.doPayment(dc, amount);
		}
		else if("ZETACARD".equalsIgnoreCase(cardType)){
			ZetaCardPayment zc = new ZetaCardPayment();
			PaymentProcess.doPayment(zc, amount);
		}
		else if("AMEXCARD".equalsIgnoreCase(cardType)){
			AmexCardPayment ap = new AmexCardPayment();
			PaymentProcess.doPayment(ap, amount);
		}
		
	}
}