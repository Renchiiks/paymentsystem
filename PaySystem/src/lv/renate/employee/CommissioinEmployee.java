package lv.renate.employee;



public class CommissioinEmployee extends Employee {

	private Double grossCommission =0.0;
	private static final Double BONUS_MULTIPLIER = 1.5;

	public CommissioinEmployee(String name, Integer bankAccount,
			Double grossWage) {
		super(name, bankAccount, grossWage);

	}

	@Override
	public Double grossPayment() {

		return grossWage + doCurrantCommission() + doCurrantBonus();
	}

	private Double doCurrantCommission() {
		Double commission = grossCommission;
		//grossCommission = 0.0;
		return commission;
	}

	public void giveCommission(Double amount) {
		grossCommission += amount;
	}

	@Override
	public void giveBonus(Double percentage) {
		currantBonuss += grossWage * (percentage/100) * BONUS_MULTIPLIER;
		
	}
	

}
