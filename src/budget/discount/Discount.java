package budget.discount;

import budget.Budget;

public interface Discount {

	Double discount (Budget budget);
	void nextDiscount (Object next);
}
