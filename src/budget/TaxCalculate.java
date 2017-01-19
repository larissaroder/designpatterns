package budget;

/**
 * Created by Larissa on 19/01/2017.
 */
public class TaxCalculate {

	public void calculate(Budget budget, Tax tax) {
		double value = tax.calculate(budget);
		System.out.println(value);

	}
}
