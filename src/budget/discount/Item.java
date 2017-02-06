package budget.discount;

/**
 * Created by Larissa on 05/02/2017.
 */
public class Item {

	private final String name;
	private final Double valeu;

	public Item(String name, Double valeu) {
		this.name = name;
		this.valeu = valeu;
	}

	public String getName() {
		return name;
	}

	public Double getValeu() {
		return valeu;
	}
}



