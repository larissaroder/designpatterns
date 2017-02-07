package budget.discount;

import budget.Budget;
import budget.discount.Discount;

/**
 * Created by Larissa on 06/02/2017.
 */
public class NotDiscount implements Discount {
	@Override
	public Double discount(Budget budget) {
		return 0.0;
	}

	@Override
	public void nextDiscount(Object next) {

	}
}
