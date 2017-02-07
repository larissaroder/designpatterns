package budget.discount;

import budget.Budget;

/**
 * Created by Larissa on 05/02/2017.
 */
public class DiscountByFiveItens implements Discount{

	private Discount next;

	@Override
	public Double discount(Budget budget) {
		//Budget has more five utens
		if (budget.getItens().size() > 5) {
			return budget.getValue() * 0.1;
		}
		return next.discount(budget);
	}

	@Override
	public void nextDiscount(Object next) {

		this.next = (Discount) next;
	}
}
