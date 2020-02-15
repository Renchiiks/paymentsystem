package lv.renate.employee;

import lv.renate.paysystem.Payee;

public abstract class Employee implements Payee {
	private String name;
	
	private Integer bankAccount;
	protected Double grossWage;
	protected Double currantBonuss;

	public Employee(String name, Integer bankAccount, Double grossWage) {
		super();
		this.name = name;
		this.bankAccount = bankAccount;
		this.grossWage = grossWage;
		currantBonuss = 0.0;
	}

	@Override
	public String name() {

		return name;
	}

	@Override
	public Integer bankAccount() {

		return bankAccount;
	}
	public abstract void giveBonus(Double precentage);
	
	protected Double doCurrantBonus(){
		Double bonus = currantBonuss;
		currantBonuss = 0.0;
		return bonus;
	}

}
