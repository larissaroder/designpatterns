package budget.discount;

import budget.Budget;

/**
 * Created by Larissa on 05/02/2017.
 */
public class DiscountCalculator {

	public Double calculate (Budget budget) {
		Discount d1 = new DiscountByFiveItens();
		Discount d2 = new DiscountByFiveHundred();
		Discount d3 = new NotDiscount();

		d1.nextDiscount(d2);
		d2.nextDiscount(d3);
		return d1.discount(budget);

	}

}
