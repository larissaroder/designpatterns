package budget.discount;

import budget.Budget;

/**
 * Created by Larissa on 05/02/2017.
 */
public interface Discount {

	Double discount (Budget budget);
	void nextDiscount (Discount next);
}
