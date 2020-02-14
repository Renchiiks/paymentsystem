package lv.renate.employee;

import lv.renate.paysystem.Payee;

public class SalaryEmployee implements Payee {
	
	private String name;
	private Integer bankAccount;
	protected Double grossWage;
	public SalaryEmployee(String name, Integer bankAccount, Double grossWage) {
		super();
		this.name = name;
		this.bankAccount = bankAccount;
		this.grossWage = grossWage;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public Double grossPayment() {
		// TODO Auto-generated method stub
		return grossWage;
	}
	@Override
	public Integer bankAccount() {
		// TODO Auto-generated method stub
		return bankAccount;
	}
	
	
	
}
