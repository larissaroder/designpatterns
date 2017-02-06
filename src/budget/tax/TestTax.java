package budget.tax;

import budget.Budget;

public class TestTax {

	public static void main(String[] args) {
		Tax iss = new ISS();
		Tax icms = new ICMS();

		Budget budget = new Budget(500.0);

		TaxCalculate calculator = new TaxCalculate();

		// Calculando o ISS
		calculator.calculate(budget, iss);

		// Calculando o ICMS
		calculator.calculate(budget, icms);
	}
}
