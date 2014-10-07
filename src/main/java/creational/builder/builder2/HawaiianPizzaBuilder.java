package creational.builder.builder2;

/** Concrete Builder */

class HawaiianPizzaBuilder implements PizzaBuilder {
	private Pizza pizza;

	public Pizza getResult() {
		return pizza;
	}

	public void createNewPizzaProduct() {
		pizza = new Pizza();
	}

	public void buildDough() {
		pizza.setDough("cross");
	}

	public void buildSauce() {
		pizza.setSauce("mild");
	}

	public void buildTopping() {
		pizza.setTopping("ham+pineapple");
	}
}
