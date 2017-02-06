package budget.discount;

import budget.Budget;

/**
 * Created by Larissa on 05/02/2017.
 */
public class DiscountByFiveHundred implements Discount {

	private Discount next;

	@Override
	public Double discount(Budget budget) {
		if (budget.getValue() > 500.00) {
			return budget.getValue() * 0.7;
		}
		return next.discount(budget);
	}

	@Override
	public void nextDiscount(Discount next) {
		this.next = next;
	}
}
