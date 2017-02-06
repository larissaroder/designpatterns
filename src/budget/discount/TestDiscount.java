package budget.discount;

import budget.Budget;
import budget.discount.DiscountCalculator;
import budget.discount.Item;

/**
 * Created by Larissa on 06/02/2017.
 */
public class TestDiscount {

	public static void main(String[] args) {
		DiscountCalculator discountCalculator = new DiscountCalculator();
		Budget budget = new Budget(500.0);
		budget.addItens(new Item("Caneta", 250.00));
		budget.addItens(new Item("Lapis", 250.00));

		Double finalDiscount = discountCalculator.calculate(budget);

		System.out.print(finalDiscount);
	}
}
