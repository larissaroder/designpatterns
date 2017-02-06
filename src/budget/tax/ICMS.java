package budget.tax;

import budget.Budget;

public class ICMS implements Tax {

	@Override
	public double calculate(Budget budget) {
		return budget.getValue() * 0.10;
	}
}
