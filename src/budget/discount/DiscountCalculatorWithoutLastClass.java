package budget.discount;

import budget.Budget;

/**
 * Created by Larissa on 05/02/2017.
 */
public class DiscountCalculatorWithoutLastClass {

	public Double calculate (Budget budget) {
		Discount d1 = new DiscountByFiveItens();
		Discount d2 = new DiscountByFiveHundred();

		d1.nextDiscount(d2);
		d2.nextDiscount(0.0);
		return d1.discount(budget);

	}

}
