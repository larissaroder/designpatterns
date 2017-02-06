package budget.tax;

import budget.Budget;

public class ICCC implements Tax {

	@Override
	public double calculate(Budget budget) {
		if (budget.getValue() < 1000 ) {
			return budget.getValue() * 0.5;
		}
		if (budget.getValue() > 3000) {
			return (budget.getValue() * 0.8 )+ 30.00;
		}
		return budget.getValue() * 0.7;
	}
}
