package lv.renate.employee;



public class SalaryEmployee extends Employee {

	public SalaryEmployee(String name, Integer bankAccount, Double grossWage) {
		super(name, bankAccount, grossWage);

	}

	@Override
	public Double grossPayment() {

		return grossWage +doCurrantBonus();
	}

	@Override
	public void giveBonus(Double precentage) {
		currantBonuss += grossWage *(precentage/100.00);
		
	}
	

}
