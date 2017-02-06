package budget;

import budget.discount.Item;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Budget {
	private final double value;
	private final List<Item> itens = new LinkedList<Item>();

	public Budget(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void addItens (Item item) {
		itens.add(item);
	}
}
