package budget.discount;

import budget.Budget;

/**
 * Created by Larissa on 06/02/2017.
 */
public class TestDiscountWithoutClass {

	public static void main(String[] args) {
		DiscountCalculator discountCalculator = new DiscountCalculator();
		Budget budget = new Budget(600.0);
		budget.addItens(new Item("Caneta", 250.00));
		budget.addItens(new Item("Lapis", 250.00));

		Double finalDiscount = discountCalculator.calculate(budget);

		System.out.print(finalDiscount);
	}
}
