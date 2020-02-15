package lv.renate.test;

import java.util.Arrays;

import lv.renate.employee.CommissioinEmployee;
import lv.renate.employee.SalaryEmployee;
import lv.renate.paysystem.Payee;
import lv.renate.paysystem.PaymentSystem;

public class TestPayment {

	
	public static void main(String[] args) {
		PaymentSystem paymentSystem = new PaymentSystem();
		CommissioinEmployee toms = new CommissioinEmployee("Toms Ozolins", 101001010, 5000.0);
		paymentSystem.addPayee(toms);
		CommissioinEmployee ieva = new CommissioinEmployee("Ieva Berzina", 101005010, 5600.0);
		paymentSystem.addPayee(ieva);
		SalaryEmployee maris = new SalaryEmployee("Maris Ozols", 6757488, 3543.9);
		paymentSystem.addPayee(maris);
		SalaryEmployee zane = new SalaryEmployee("Zane Berza", 58457922, 4065.7);
		paymentSystem.addPayee(zane);
		
		ieva.giveBonus(3.3);
		zane.giveBonus(34.0);
		
	
		
		//simulate work
		toms.giveCommission(4.0);
		toms.giveCommission(54.7);
		ieva.giveCommission(43.7);
		ieva.giveCommission(34.7);
		toms.giveCommission(67.5);
		toms.giveCommission(43.1);
		paymentSystem.printName();
		paymentSystem.processPayments();
		
		
		

	}

}
