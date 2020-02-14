package lv.renate.paysystem;

import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {
	
	private List<Payee>payees;
	
	public PaymentSystem() {
		payees = new ArrayList<>();
		
	}
	
	public void addPayee(Payee payee) {
		if(!payees.contains(payee)){
			payees.add(payee);
			
		}
	}
	public void processPayments(){
		for (Payee payee : payees) {
			Double grossPayment = payee.grossPayment();
			
			System.out.println("Paying to  "+payee.name());
			System.out.println("tGrosst "+grossPayment);
			System.out.println("Trasferred to Account: "+payee.bankAccount());
		}
	}

}
